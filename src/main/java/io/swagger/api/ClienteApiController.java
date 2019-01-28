package io.swagger.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Cliente;
import io.swagger.model.Clientes;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-27T19:44:20.661Z")

@Controller
public class ClienteApiController implements ClienteApi {

	private static final Logger log = LoggerFactory.getLogger(ClienteApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public ClienteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Cliente> alteraCliente(
			@ApiParam(value = "Id do cliente.", required = true) @PathVariable("id") Integer id,
			@ApiParam(value = "", required = true) @Valid @RequestBody Cliente cliente) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<Cliente>(objectMapper.readValue(
						"{  \"tipo\" : \"interno\",  \"dataAtualizacaoRegistro\" : \"2000-01-23\",  \"nome\" : \"nome\",  \"id\" : 0,  \"iniciais\" : \"iniciais\",  \"sobrenome\" : \"sobrenome\",  \"dataNascimento\" : \"2000-01-23\",  \"status\" : true}",
						Cliente.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<Cliente>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Cliente> alteraStatusPorId(
			@ApiParam(value = "status do cliente.", required = true, allowableValues = "\"ativo\", \"inativo\"") @PathVariable("status") String status,
			@ApiParam(value = "id do cliente.", required = true) @PathVariable("id") Integer id) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<Cliente>(objectMapper.readValue(
						"{  \"tipo\" : \"interno\",  \"dataAtualizacaoRegistro\" : \"2000-01-23\",  \"nome\" : \"nome\",  \"id\" : 0,  \"iniciais\" : \"iniciais\",  \"sobrenome\" : \"sobrenome\",  \"dataNascimento\" : \"2000-01-23\",  \"status\" : true}",
						Cliente.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<Cliente>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Cliente> cadastraNovo(@ApiParam(value = "", required = true) @Valid @RequestBody Cliente cliente) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<Cliente>(objectMapper.readValue(
						"{  \"tipo\" : \"interno\",  \"dataAtualizacaoRegistro\" : \"2000-01-23\",  \"nome\" : \"nome\",  \"id\" : 0,  \"iniciais\" : \"iniciais\",  \"sobrenome\" : \"sobrenome\",  \"dataNascimento\" : \"2000-01-23\",  \"status\" : true}",
						Cliente.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<Cliente>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Cliente> consultaClientePorId(@ApiParam(value = "Número do Id do cliente consultado.", required = true) @PathVariable("id") Integer id) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<Cliente>(objectMapper.readValue(
						"{  \"tipo\" : \"interno\",  \"dataAtualizacaoRegistro\" : \"2000-01-23\",  \"nome\" : \"nome\",  \"id\" : 0,  \"iniciais\" : \"iniciais\",  \"sobrenome\" : \"sobrenome\",  \"dataNascimento\" : \"2000-01-23\",  \"status\" : true}",
						Cliente.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<Cliente>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Clientes> consultaClientePorSobrenome(@ApiParam(value = "Sobrenome do cliente.", required = true) @PathVariable("sobrenome") String sobrenome) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<Clientes>(objectMapper.readValue("\"\"", Clientes.class),
						HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<Clientes>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<Clientes>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> excluirClientePorId(@ApiParam(value = "Número do id do cliente excluído", required = true) @PathVariable("id") Integer id) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

}
