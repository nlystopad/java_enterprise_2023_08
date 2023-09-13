package contracts.api.student.positive

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""
Represents a successful scenario of updating an existing Student object

```
given:
    client updates student.
when:
    a valid request is submitted
then:
    response body is returned.
```

""")
    request {
        method 'PUT'
        url $(consumer(regex('/api/v1/updateStudent/[0-9]{2}')), producer('/api/v1/updateStudent/12'))
        headers {
            contentType(applicationJson())
            accept(applicationJson())
        }
        body(file('positiveStudentUpdate.json'))

    }

    response {
        status OK()
        body(file('positiveStudentUpdate.json'))

    }

}