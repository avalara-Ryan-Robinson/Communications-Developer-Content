/*
 * SaasPro
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.LocationItem;

/**
 * PCodeLookupResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-14T16:02:52.336-05:00[America/New_York]")
public class PCodeLookupResult {
  public static final String SERIALIZED_NAME_LOCATION_DATA = "LocationData";
  @SerializedName(SERIALIZED_NAME_LOCATION_DATA)
  private List<LocationItem> locationData = null;

  public static final String SERIALIZED_NAME_MATCH_COUNT = "MatchCount";
  @SerializedName(SERIALIZED_NAME_MATCH_COUNT)
  private Integer matchCount;

  public static final String SERIALIZED_NAME_INPUT_MATCH_TYPE = "InputMatchType";
  @SerializedName(SERIALIZED_NAME_INPUT_MATCH_TYPE)
  private String inputMatchType;

  public static final String SERIALIZED_NAME_MATCH_TYPE_APPLIED = "MatchTypeApplied";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE_APPLIED)
  private String matchTypeApplied;

  public static final String SERIALIZED_NAME_RESULTS_LIMIT = "ResultsLimit";
  @SerializedName(SERIALIZED_NAME_RESULTS_LIMIT)
  private Integer resultsLimit;


  public PCodeLookupResult locationData(List<LocationItem> locationData) {
    
    this.locationData = locationData;
    return this;
  }

  public PCodeLookupResult addLocationDataItem(LocationItem locationDataItem) {
    if (this.locationData == null) {
      this.locationData = new ArrayList<LocationItem>();
    }
    this.locationData.add(locationDataItem);
    return this;
  }

   /**
   * Get locationData
   * @return locationData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LocationItem> getLocationData() {
    return locationData;
  }


  public void setLocationData(List<LocationItem> locationData) {
    this.locationData = locationData;
  }


  public PCodeLookupResult matchCount(Integer matchCount) {
    
    this.matchCount = matchCount;
    return this;
  }

   /**
   * Get matchCount
   * @return matchCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMatchCount() {
    return matchCount;
  }


  public void setMatchCount(Integer matchCount) {
    this.matchCount = matchCount;
  }


  public PCodeLookupResult inputMatchType(String inputMatchType) {
    
    this.inputMatchType = inputMatchType;
    return this;
  }

   /**
   * Get inputMatchType
   * @return inputMatchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInputMatchType() {
    return inputMatchType;
  }


  public void setInputMatchType(String inputMatchType) {
    this.inputMatchType = inputMatchType;
  }


  public PCodeLookupResult matchTypeApplied(String matchTypeApplied) {
    
    this.matchTypeApplied = matchTypeApplied;
    return this;
  }

   /**
   * Get matchTypeApplied
   * @return matchTypeApplied
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchTypeApplied() {
    return matchTypeApplied;
  }


  public void setMatchTypeApplied(String matchTypeApplied) {
    this.matchTypeApplied = matchTypeApplied;
  }


  public PCodeLookupResult resultsLimit(Integer resultsLimit) {
    
    this.resultsLimit = resultsLimit;
    return this;
  }

   /**
   * Get resultsLimit
   * @return resultsLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getResultsLimit() {
    return resultsLimit;
  }


  public void setResultsLimit(Integer resultsLimit) {
    this.resultsLimit = resultsLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PCodeLookupResult pcodeLookupResult = (PCodeLookupResult) o;
    return Objects.equals(this.locationData, pcodeLookupResult.locationData) &&
        Objects.equals(this.matchCount, pcodeLookupResult.matchCount) &&
        Objects.equals(this.inputMatchType, pcodeLookupResult.inputMatchType) &&
        Objects.equals(this.matchTypeApplied, pcodeLookupResult.matchTypeApplied) &&
        Objects.equals(this.resultsLimit, pcodeLookupResult.resultsLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationData, matchCount, inputMatchType, matchTypeApplied, resultsLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PCodeLookupResult {\n");
    sb.append("    locationData: ").append(toIndentedString(locationData)).append("\n");
    sb.append("    matchCount: ").append(toIndentedString(matchCount)).append("\n");
    sb.append("    inputMatchType: ").append(toIndentedString(inputMatchType)).append("\n");
    sb.append("    matchTypeApplied: ").append(toIndentedString(matchTypeApplied)).append("\n");
    sb.append("    resultsLimit: ").append(toIndentedString(resultsLimit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
