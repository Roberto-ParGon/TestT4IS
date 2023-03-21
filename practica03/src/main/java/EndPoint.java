
import org.springframework.stereotype.Repository;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;


import https.t4is_uv_mx.saludos.SaludarRequest;
import https.t4is_uv_mx.saludos.SaludarResponse;

@EndPoint
public class EndPoint {
    @PayloadRoot(localPart = "SaludarRequest", namespace = "https://t4is.uv.mx/saludos")

    @ResponsePayload
    public SaludarResponse Saludar(@RequestPayload SaludarRequest peticion) {
        SaludarResponse response = new SaludarResponse();
        response.setRespuesta("Hola, " + peticion.getNombre());
        return response;
    }

}
