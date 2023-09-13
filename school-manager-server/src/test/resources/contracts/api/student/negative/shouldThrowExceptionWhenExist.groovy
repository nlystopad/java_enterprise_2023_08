package contracts.api.student.negative

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""
Represents an unsuccessful scenario of creating a new Student object

```
given:
    client creates student.
when:
    a non-valid request is submitted
then:
    Exception is thrown.
```

""")
    request {
        method 'POST'
        url $(consumer(regex('/api/v1/student')), producer('/api/v1/student'))
        headers {
            contentType(applicationJson())
            accept(applicationJson())
        }
        body(file('negativeCreateStudent.json'))

    }

    response {
        status BAD_REQUEST()
        body(file('badRequestCreateStudent.json'))

    }

}