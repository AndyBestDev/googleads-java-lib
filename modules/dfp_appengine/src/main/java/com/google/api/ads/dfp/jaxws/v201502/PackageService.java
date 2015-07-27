
package com.google.api.ads.dfp.jaxws.v201502;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PackageService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201502/PackageService?wsdl")
public class PackageService
    extends Service
{

    private final static URL PACKAGESERVICE_WSDL_LOCATION;
    private final static WebServiceException PACKAGESERVICE_EXCEPTION;
    private final static QName PACKAGESERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201502", "PackageService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201502/PackageService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PACKAGESERVICE_WSDL_LOCATION = url;
        PACKAGESERVICE_EXCEPTION = e;
    }

    public PackageService() {
        super(__getWsdlLocation(), PACKAGESERVICE_QNAME);
    }

    public PackageService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns PackageServiceInterface
     */
    @WebEndpoint(name = "PackageServiceInterfacePort")
    public PackageServiceInterface getPackageServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201502", "PackageServiceInterfacePort"), PackageServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PackageServiceInterface
     */
    @WebEndpoint(name = "PackageServiceInterfacePort")
    public PackageServiceInterface getPackageServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201502", "PackageServiceInterfacePort"), PackageServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PACKAGESERVICE_EXCEPTION!= null) {
            throw PACKAGESERVICE_EXCEPTION;
        }
        return PACKAGESERVICE_WSDL_LOCATION;
    }

}