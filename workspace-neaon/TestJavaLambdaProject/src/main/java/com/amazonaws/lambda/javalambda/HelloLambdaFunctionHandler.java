package com.amazonaws.lambda.javalambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloLambdaFunctionHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String inputName, Context context) {
        context.getLogger().log("Input Name: " + inputName);

        // TODO: implement your handler
        return "Hello from Lambda!"+inputName;
    }

}
