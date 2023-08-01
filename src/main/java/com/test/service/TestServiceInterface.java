package com.test.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.groups.ConvertGroup;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
@Path("/test")
public interface TestServiceInterface {
  @POST
  @Consumes({"application/json"})
  Response doSomething(@Valid @ConvertGroup(to = Error.class) @NotNull String myParameter);
}
