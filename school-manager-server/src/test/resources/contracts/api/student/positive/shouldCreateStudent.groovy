package contracts.api.student.positive

import org.springframework.cloud.contract.spec.Contract


Contract.make {
    description("""
Represents a successful scenario of creating a new Student object

```
given:
    client creates student.
when:
    a valid request is submitted
then:
    response body is returned.
```

""")
    request {
        method 'POST'
        url $(consumer(regex('/api/v1/student')), producer('/api/v1/student'))
        headers {
            contentType(applicationJson())
            accept(applicationJson())
        }
        body(file('positiveStudentCreate.json'))

    }

    response {
        status CREATED()
        body(file('positiveStudentCreate.json'))

    }

}
