package test.lambda2;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by toddtellman on 6/27/17.
 */
public class TestNameFunction implements RequestHandler<Integer, List<String>> {

    public List<String> handleRequest(Integer numberOfNames, Context context) {
        List<String> namesList = new ArrayList<String>();
        System.out.println("in request. Value is " + numberOfNames);
        for(int i=0; i < numberOfNames; i++){
            System.out.println("request # " + i);
            namesList.add("Todd " + i);

        }

        System.out.println("List size " + namesList.size());
        return namesList;
    }

//    {
//        "key" : "$input.params('key')"
//    }
}
