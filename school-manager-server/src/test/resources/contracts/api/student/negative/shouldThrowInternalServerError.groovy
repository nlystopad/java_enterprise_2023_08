package contracts.api.student.negative

import org.springframework.cloud.contract.spec.Contract


Contract.make {
    description("""
Represents an unsuccessful scenario of getting an existing Student object

```
given:
    client gets student.
when:
    a non-valid request is submitted
then:
    Exception is thrown.
```

""")
    request {
        method 'GET'
        url $(consumer(regex('/api/v1/student/[0-9]{2}')), producer('/api/v1/student/25'))
        headers {
            contentType(applicationJson())
            accept(applicationJson())
        }

    }

    response {
        status INTERNAL_SERVER_ERROR()
        body(file('internalServerErrorGetStudent.json'))

    }
}
