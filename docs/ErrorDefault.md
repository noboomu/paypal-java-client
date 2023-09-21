

# ErrorDefault

The default error response.

## oneOf schemas
* [Error400](Error400.md)
* [Error401](Error401.md)
* [Error403](Error403.md)
* [Error404](Error404.md)
* [Error409](Error409.md)
* [Error415](Error415.md)
* [Error422](Error422.md)
* [Error500](Error500.md)
* [Error503](Error503.md)

## Example
```java
// Import classes:
import io.sinistral.s1.payments.paypal.models.ErrorDefault;
import io.sinistral.s1.payments.paypal.models.Error400;
import io.sinistral.s1.payments.paypal.models.Error401;
import io.sinistral.s1.payments.paypal.models.Error403;
import io.sinistral.s1.payments.paypal.models.Error404;
import io.sinistral.s1.payments.paypal.models.Error409;
import io.sinistral.s1.payments.paypal.models.Error415;
import io.sinistral.s1.payments.paypal.models.Error422;
import io.sinistral.s1.payments.paypal.models.Error500;
import io.sinistral.s1.payments.paypal.models.Error503;

public class Example {
    public static void main(String[] args) {
        ErrorDefault exampleErrorDefault = new ErrorDefault();

        // create a new Error400
        Error400 exampleError400 = new Error400();
        // set ErrorDefault to Error400
        exampleErrorDefault.setActualInstance(exampleError400);
        // to get back the Error400 set earlier
        Error400 testError400 = (Error400) exampleErrorDefault.getActualInstance();

        // create a new Error401
        Error401 exampleError401 = new Error401();
        // set ErrorDefault to Error401
        exampleErrorDefault.setActualInstance(exampleError401);
        // to get back the Error401 set earlier
        Error401 testError401 = (Error401) exampleErrorDefault.getActualInstance();

        // create a new Error403
        Error403 exampleError403 = new Error403();
        // set ErrorDefault to Error403
        exampleErrorDefault.setActualInstance(exampleError403);
        // to get back the Error403 set earlier
        Error403 testError403 = (Error403) exampleErrorDefault.getActualInstance();

        // create a new Error404
        Error404 exampleError404 = new Error404();
        // set ErrorDefault to Error404
        exampleErrorDefault.setActualInstance(exampleError404);
        // to get back the Error404 set earlier
        Error404 testError404 = (Error404) exampleErrorDefault.getActualInstance();

        // create a new Error409
        Error409 exampleError409 = new Error409();
        // set ErrorDefault to Error409
        exampleErrorDefault.setActualInstance(exampleError409);
        // to get back the Error409 set earlier
        Error409 testError409 = (Error409) exampleErrorDefault.getActualInstance();

        // create a new Error415
        Error415 exampleError415 = new Error415();
        // set ErrorDefault to Error415
        exampleErrorDefault.setActualInstance(exampleError415);
        // to get back the Error415 set earlier
        Error415 testError415 = (Error415) exampleErrorDefault.getActualInstance();

        // create a new Error422
        Error422 exampleError422 = new Error422();
        // set ErrorDefault to Error422
        exampleErrorDefault.setActualInstance(exampleError422);
        // to get back the Error422 set earlier
        Error422 testError422 = (Error422) exampleErrorDefault.getActualInstance();

        // create a new Error500
        Error500 exampleError500 = new Error500();
        // set ErrorDefault to Error500
        exampleErrorDefault.setActualInstance(exampleError500);
        // to get back the Error500 set earlier
        Error500 testError500 = (Error500) exampleErrorDefault.getActualInstance();

        // create a new Error503
        Error503 exampleError503 = new Error503();
        // set ErrorDefault to Error503
        exampleErrorDefault.setActualInstance(exampleError503);
        // to get back the Error503 set earlier
        Error503 testError503 = (Error503) exampleErrorDefault.getActualInstance();
    }
}
```


