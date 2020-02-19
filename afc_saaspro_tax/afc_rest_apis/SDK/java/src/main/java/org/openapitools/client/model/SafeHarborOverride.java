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

/**
 * Safe harbor rate override for a USF tax type.
 */
@ApiModel(description = "Safe harbor rate override for a USF tax type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-14T16:02:52.336-05:00[America/New_York]")
public class SafeHarborOverride {
  public static final String SERIALIZED_NAME_SH = "sh";
  @SerializedName(SERIALIZED_NAME_SH)
  private Integer sh;

  public static final String SERIALIZED_NAME_OLD = "old";
  @SerializedName(SERIALIZED_NAME_OLD)
  private Double old;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Double _new;


  public SafeHarborOverride sh(Integer sh) {
    
    this.sh = sh;
    return this;
  }

   /**
   * Get sh
   * @return sh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSh() {
    return sh;
  }


  public void setSh(Integer sh) {
    this.sh = sh;
  }


  public SafeHarborOverride old(Double old) {
    
    this.old = old;
    return this;
  }

   /**
   * Get old
   * @return old
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getOld() {
    return old;
  }


  public void setOld(Double old) {
    this.old = old;
  }


  public SafeHarborOverride _new(Double _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getNew() {
    return _new;
  }


  public void setNew(Double _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SafeHarborOverride safeHarborOverride = (SafeHarborOverride) o;
    return Objects.equals(this.sh, safeHarborOverride.sh) &&
        Objects.equals(this.old, safeHarborOverride.old) &&
        Objects.equals(this._new, safeHarborOverride._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sh, old, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SafeHarborOverride {\n");
    sb.append("    sh: ").append(toIndentedString(sh)).append("\n");
    sb.append("    old: ").append(toIndentedString(old)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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
