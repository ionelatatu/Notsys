package com.notsys.adapter.outbound.keycloak

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("notsys.keycloak")
data class KeycloakProperties(val baseUrl: String, val realm: String, val clientId: String, val clientSecret: String)
