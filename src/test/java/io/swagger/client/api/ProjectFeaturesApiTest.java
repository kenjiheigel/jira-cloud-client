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

import io.swagger.client.model.ContainerForProjectFeatures;
import io.swagger.client.model.ProjectFeatureState;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ProjectFeaturesApi
 */
@Ignore
public class ProjectFeaturesApiTest {

    private final ProjectFeaturesApi api = new ProjectFeaturesApi();

    /**
     * Get project features
     *
     * Returns the list of features for a project.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFeaturesForProjectTest() throws Exception {
        String projectIdOrKey = null;
        ContainerForProjectFeatures response = api.getFeaturesForProject(projectIdOrKey);

        // TODO: test validations
    }
    /**
     * Set project feature state
     *
     * Sets the state of a project feature.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void toggleFeatureForProjectTest() throws Exception {
        ProjectFeatureState body = null;
        String projectIdOrKey = null;
        String featureKey = null;
        ContainerForProjectFeatures response = api.toggleFeatureForProject(body, projectIdOrKey, featureKey);

        // TODO: test validations
    }
}