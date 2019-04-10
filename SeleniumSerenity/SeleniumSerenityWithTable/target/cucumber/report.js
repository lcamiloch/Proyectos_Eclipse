$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GoogleBusquedaConDatos.feature");
formatter.feature({
  "name": "Busqueda en Google con datos",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Arthur quiere buscar en google",
  "keyword": "Given "
});
formatter.step({
  "name": "el busca la palabra \"\u003cpalabra\u003e\" compuesta \"\u003cpalabrados\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "el verifica la palabra \"\u003cpalabra\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "palabra",
        "palabrados"
      ]
    },
    {
      "cells": [
        "Nintendo",
        "switch"
      ]
    },
    {
      "cells": [
        "Futbol",
        "argentino"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Arthur quiere buscar en google",
  "keyword": "Given "
});
formatter.match({
  "location": "BusquedaGoogleConDatos.arthurQuiereBuscarEnGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el busca la palabra \"Nintendo\" compuesta \"switch\"",
  "keyword": "When "
});
formatter.match({
  "location": "BusquedaGoogleConDatos.elBuscaLaPalabra(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el verifica la palabra \"Nintendo\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BusquedaGoogleConDatos.elVerificaLaPalabra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Arthur quiere buscar en google",
  "keyword": "Given "
});
formatter.match({
  "location": "BusquedaGoogleConDatos.arthurQuiereBuscarEnGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el busca la palabra \"Futbol\" compuesta \"argentino\"",
  "keyword": "When "
});
formatter.match({
  "location": "BusquedaGoogleConDatos.elBuscaLaPalabra(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el verifica la palabra \"Futbol\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BusquedaGoogleConDatos.elVerificaLaPalabra(String)"
});
formatter.result({
  "status": "passed"
});
});