package com.sapient.knox.validator;

/**
 * Created by Shubham A Gupta on 19-Apr-18.
 */
import org.apache.knox.gateway.preauth.filter.PreAuthValidationException;
import org.apache.knox.gateway.preauth.filter.PreAuthValidator;

import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;

public class CustomValidator implements PreAuthValidator {

    //Any string constant value should work for these 3 variables
    //This string will be used in 'org.apache.knox.gateway.preauth.filter.PreAuthValidator' file.
    public static final String CUSTOM_VALIDATOR_NAME = "com.sapient.knox.validator.CustomValidator";
    //Optional: User may want to pass soemthign through HTTP header. (per client request)
    public static final String CUSTOM_TOKEN_HEADER_NAME = "foo_claim";


    /**
     * @param httpRequest
     * @param filterConfig
     * @return
     * @throws PreAuthValidationException
     */
    public boolean validate(HttpServletRequest httpRequest, FilterConfig filterConfig) throws PreAuthValidationException {
        System.out.println("=================Shubham=================");
        System.out.println("===========" + httpRequest.toString());
        System.out.println("===========" + httpRequest.getRemoteUser().toString());
        return true;
    }

    /**
     * Define unique validator name
     *
     * @return
     */
    public String getName() {
        return CUSTOM_VALIDATOR_NAME;
    }
}
