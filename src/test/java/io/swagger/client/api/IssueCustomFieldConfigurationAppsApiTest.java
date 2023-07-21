/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * OpenAPI spec version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.CustomFieldConfigurations;
import io.swagger.client.model.PageBeanContextualConfiguration;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IssueCustomFieldConfigurationAppsApi
 */
@Ignore
public class IssueCustomFieldConfigurationAppsApiTest {

    private final IssueCustomFieldConfigurationAppsApi api = new IssueCustomFieldConfigurationAppsApi();

    /**
     * Get custom field configurations
     *
     * Returns a [paginated](#pagination) list of configurations for a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  The result can be filtered by one of these criteria:   *  &#x60;id&#x60;.  *  &#x60;fieldContextId&#x60;.  *  &#x60;issueId&#x60;.  *  &#x60;projectKeyOrId&#x60; and &#x60;issueTypeId&#x60;.  Otherwise, all configurations are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCustomFieldConfigurationTest() throws Exception {
        String fieldIdOrKey = null;
        List<Long> id = null;
        List<Long> fieldContextId = null;
        Long issueId = null;
        String projectKeyOrId = null;
        String issueTypeId = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanContextualConfiguration response = api.getCustomFieldConfiguration(fieldIdOrKey, id, fieldContextId, issueId, projectKeyOrId, issueTypeId, startAt, maxResults);

        // TODO: test validations
    }
    /**
     * Update custom field configurations
     *
     * Update the configuration for contexts of a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateCustomFieldConfigurationTest() throws Exception {
        CustomFieldConfigurations body = null;
        String fieldIdOrKey = null;
        Object response = api.updateCustomFieldConfiguration(body, fieldIdOrKey);

        // TODO: test validations
    }
}
