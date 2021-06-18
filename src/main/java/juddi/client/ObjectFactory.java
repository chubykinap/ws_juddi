
package juddi.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the juddi.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddFlightResponse_QNAME = new QName("http://client.juddi/", "addFlightResponse");
    private final static QName _GetFlights_QNAME = new QName("http://client.juddi/", "getFlights");
    private final static QName _DeleteFlight_QNAME = new QName("http://client.juddi/", "deleteFlight");
    private final static QName _GetFlightsResponse_QNAME = new QName("http://client.juddi/", "getFlightsResponse");
    private final static QName _AddFlight_QNAME = new QName("http://client.juddi/", "addFlight");
    private final static QName _ChangeFlightResponse_QNAME = new QName("http://client.juddi/", "changeFlightResponse");
    private final static QName _SQLTransactionException_QNAME = new QName("http://client.juddi/", "SQLTransactionException");
    private final static QName _ChangeFlight_QNAME = new QName("http://client.juddi/", "changeFlight");
    private final static QName _DeleteFlightResponse_QNAME = new QName("http://client.juddi/", "deleteFlightResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: juddi.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddFlightResponse }
     * 
     */
    public AddFlightResponse createAddFlightResponse() {
        return new AddFlightResponse();
    }

    /**
     * Create an instance of {@link GetFlights }
     * 
     */
    public GetFlights createGetFlights() {
        return new GetFlights();
    }

    /**
     * Create an instance of {@link DeleteFlight }
     * 
     */
    public DeleteFlight createDeleteFlight() {
        return new DeleteFlight();
    }

    /**
     * Create an instance of {@link AddFlight }
     * 
     */
    public AddFlight createAddFlight() {
        return new AddFlight();
    }

    /**
     * Create an instance of {@link ChangeFlightResponse }
     * 
     */
    public ChangeFlightResponse createChangeFlightResponse() {
        return new ChangeFlightResponse();
    }

    /**
     * Create an instance of {@link GetFlightsResponse }
     * 
     */
    public GetFlightsResponse createGetFlightsResponse() {
        return new GetFlightsResponse();
    }

    /**
     * Create an instance of {@link ChangeFlight }
     * 
     */
    public ChangeFlight createChangeFlight() {
        return new ChangeFlight();
    }

    /**
     * Create an instance of {@link DeleteFlightResponse }
     * 
     */
    public DeleteFlightResponse createDeleteFlightResponse() {
        return new DeleteFlightResponse();
    }

    /**
     * Create an instance of {@link SqlFault }
     * 
     */
    public SqlFault createSqlFault() {
        return new SqlFault();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.juddi/", name = "addFlightResponse")
    public JAXBElement<AddFlightResponse> createAddFlightResponse(AddFlightResponse value) {
        return new JAXBElement<AddFlightResponse>(_AddFlightResponse_QNAME, AddFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.juddi/", name = "getFlights")
    public JAXBElement<GetFlights> createGetFlights(GetFlights value) {
        return new JAXBElement<GetFlights>(_GetFlights_QNAME, GetFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.juddi/", name = "deleteFlight")
    public JAXBElement<DeleteFlight> createDeleteFlight(DeleteFlight value) {
        return new JAXBElement<DeleteFlight>(_DeleteFlight_QNAME, DeleteFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.juddi/", name = "getFlightsResponse")
    public JAXBElement<GetFlightsResponse> createGetFlightsResponse(GetFlightsResponse value) {
        return new JAXBElement<GetFlightsResponse>(_GetFlightsResponse_QNAME, GetFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.juddi/", name = "addFlight")
    public JAXBElement<AddFlight> createAddFlight(AddFlight value) {
        return new JAXBElement<AddFlight>(_AddFlight_QNAME, AddFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.juddi/", name = "changeFlightResponse")
    public JAXBElement<ChangeFlightResponse> createChangeFlightResponse(ChangeFlightResponse value) {
        return new JAXBElement<ChangeFlightResponse>(_ChangeFlightResponse_QNAME, ChangeFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SqlFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.juddi/", name = "SQLTransactionException")
    public JAXBElement<SqlFault> createSQLTransactionException(SqlFault value) {
        return new JAXBElement<SqlFault>(_SQLTransactionException_QNAME, SqlFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.juddi/", name = "changeFlight")
    public JAXBElement<ChangeFlight> createChangeFlight(ChangeFlight value) {
        return new JAXBElement<ChangeFlight>(_ChangeFlight_QNAME, ChangeFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.juddi/", name = "deleteFlightResponse")
    public JAXBElement<DeleteFlightResponse> createDeleteFlightResponse(DeleteFlightResponse value) {
        return new JAXBElement<DeleteFlightResponse>(_DeleteFlightResponse_QNAME, DeleteFlightResponse.class, null, value);
    }

}
