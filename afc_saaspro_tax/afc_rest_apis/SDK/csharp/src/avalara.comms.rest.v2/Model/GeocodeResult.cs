/* 
 * SaasPro
 *
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = avalara.comms.rest.v2.Client.OpenAPIDateConverter;

namespace avalara.comms.rest.v2.Model
{
    /// <summary>
    /// Results for geocoding request.
    /// </summary>
    [DataContract]
    public partial class GeocodeResult :  IEquatable<GeocodeResult>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GeocodeResult" /> class.
        /// </summary>
        /// <param name="_ref">_ref.</param>
        /// <param name="cass">cass.</param>
        /// <param name="cBlk">cBlk.</param>
        /// <param name="cTrc">cTrc.</param>
        /// <param name="cnty">cnty.</param>
        /// <param name="feat">feat.</param>
        /// <param name="fips">fips.</param>
        /// <param name="inc">inc.</param>
        /// <param name="jur">jur.</param>
        /// <param name="lat">lat.</param>
        /// <param name="_long">_long.</param>
        /// <param name="pcd">pcd.</param>
        /// <param name="scr">scr.</param>
        /// <param name="err">err.</param>
        public GeocodeResult(string _ref = default(string), Address cass = default(Address), int? cBlk = default(int?), int? cTrc = default(int?), string cnty = default(string), int? feat = default(int?), string fips = default(string), bool? inc = default(bool?), string jur = default(string), double? lat = default(double?), double? _long = default(double?), int? pcd = default(int?), double? scr = default(double?), string err = default(string))
        {
            this.Ref = _ref;
            this.Cass = cass;
            this.CBlk = cBlk;
            this.CTrc = cTrc;
            this.Cnty = cnty;
            this.Feat = feat;
            this.Fips = fips;
            this.Inc = inc;
            this.Jur = jur;
            this.Lat = lat;
            this.Long = _long;
            this.Pcd = pcd;
            this.Scr = scr;
            this.Err = err;
            this.Ref = _ref;
            this.Cass = cass;
            this.CBlk = cBlk;
            this.CTrc = cTrc;
            this.Cnty = cnty;
            this.Feat = feat;
            this.Fips = fips;
            this.Inc = inc;
            this.Jur = jur;
            this.Lat = lat;
            this.Long = _long;
            this.Pcd = pcd;
            this.Scr = scr;
            this.Err = err;
        }
        
        /// <summary>
        /// Gets or Sets Ref
        /// </summary>
        [DataMember(Name="ref", EmitDefaultValue=true)]
        public string Ref { get; set; }

        /// <summary>
        /// Gets or Sets Cass
        /// </summary>
        [DataMember(Name="cass", EmitDefaultValue=true)]
        public Address Cass { get; set; }

        /// <summary>
        /// Gets or Sets CBlk
        /// </summary>
        [DataMember(Name="cBlk", EmitDefaultValue=true)]
        public int? CBlk { get; set; }

        /// <summary>
        /// Gets or Sets CTrc
        /// </summary>
        [DataMember(Name="cTrc", EmitDefaultValue=true)]
        public int? CTrc { get; set; }

        /// <summary>
        /// Gets or Sets Cnty
        /// </summary>
        [DataMember(Name="cnty", EmitDefaultValue=true)]
        public string Cnty { get; set; }

        /// <summary>
        /// Gets or Sets Feat
        /// </summary>
        [DataMember(Name="feat", EmitDefaultValue=true)]
        public int? Feat { get; set; }

        /// <summary>
        /// Gets or Sets Fips
        /// </summary>
        [DataMember(Name="fips", EmitDefaultValue=true)]
        public string Fips { get; set; }

        /// <summary>
        /// Gets or Sets Inc
        /// </summary>
        [DataMember(Name="inc", EmitDefaultValue=true)]
        public bool? Inc { get; set; }

        /// <summary>
        /// Gets or Sets Jur
        /// </summary>
        [DataMember(Name="jur", EmitDefaultValue=true)]
        public string Jur { get; set; }

        /// <summary>
        /// Gets or Sets Lat
        /// </summary>
        [DataMember(Name="lat", EmitDefaultValue=true)]
        public double? Lat { get; set; }

        /// <summary>
        /// Gets or Sets Long
        /// </summary>
        [DataMember(Name="long", EmitDefaultValue=true)]
        public double? Long { get; set; }

        /// <summary>
        /// Gets or Sets Pcd
        /// </summary>
        [DataMember(Name="pcd", EmitDefaultValue=true)]
        public int? Pcd { get; set; }

        /// <summary>
        /// Gets or Sets Scr
        /// </summary>
        [DataMember(Name="scr", EmitDefaultValue=true)]
        public double? Scr { get; set; }

        /// <summary>
        /// Gets or Sets Err
        /// </summary>
        [DataMember(Name="err", EmitDefaultValue=true)]
        public string Err { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GeocodeResult {\n");
            sb.Append("  Ref: ").Append(Ref).Append("\n");
            sb.Append("  Cass: ").Append(Cass).Append("\n");
            sb.Append("  CBlk: ").Append(CBlk).Append("\n");
            sb.Append("  CTrc: ").Append(CTrc).Append("\n");
            sb.Append("  Cnty: ").Append(Cnty).Append("\n");
            sb.Append("  Feat: ").Append(Feat).Append("\n");
            sb.Append("  Fips: ").Append(Fips).Append("\n");
            sb.Append("  Inc: ").Append(Inc).Append("\n");
            sb.Append("  Jur: ").Append(Jur).Append("\n");
            sb.Append("  Lat: ").Append(Lat).Append("\n");
            sb.Append("  Long: ").Append(Long).Append("\n");
            sb.Append("  Pcd: ").Append(Pcd).Append("\n");
            sb.Append("  Scr: ").Append(Scr).Append("\n");
            sb.Append("  Err: ").Append(Err).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GeocodeResult);
        }

        /// <summary>
        /// Returns true if GeocodeResult instances are equal
        /// </summary>
        /// <param name="input">Instance of GeocodeResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GeocodeResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Ref == input.Ref ||
                    (this.Ref != null &&
                    this.Ref.Equals(input.Ref))
                ) && 
                (
                    this.Cass == input.Cass ||
                    (this.Cass != null &&
                    this.Cass.Equals(input.Cass))
                ) && 
                (
                    this.CBlk == input.CBlk ||
                    (this.CBlk != null &&
                    this.CBlk.Equals(input.CBlk))
                ) && 
                (
                    this.CTrc == input.CTrc ||
                    (this.CTrc != null &&
                    this.CTrc.Equals(input.CTrc))
                ) && 
                (
                    this.Cnty == input.Cnty ||
                    (this.Cnty != null &&
                    this.Cnty.Equals(input.Cnty))
                ) && 
                (
                    this.Feat == input.Feat ||
                    (this.Feat != null &&
                    this.Feat.Equals(input.Feat))
                ) && 
                (
                    this.Fips == input.Fips ||
                    (this.Fips != null &&
                    this.Fips.Equals(input.Fips))
                ) && 
                (
                    this.Inc == input.Inc ||
                    (this.Inc != null &&
                    this.Inc.Equals(input.Inc))
                ) && 
                (
                    this.Jur == input.Jur ||
                    (this.Jur != null &&
                    this.Jur.Equals(input.Jur))
                ) && 
                (
                    this.Lat == input.Lat ||
                    (this.Lat != null &&
                    this.Lat.Equals(input.Lat))
                ) && 
                (
                    this.Long == input.Long ||
                    (this.Long != null &&
                    this.Long.Equals(input.Long))
                ) && 
                (
                    this.Pcd == input.Pcd ||
                    (this.Pcd != null &&
                    this.Pcd.Equals(input.Pcd))
                ) && 
                (
                    this.Scr == input.Scr ||
                    (this.Scr != null &&
                    this.Scr.Equals(input.Scr))
                ) && 
                (
                    this.Err == input.Err ||
                    (this.Err != null &&
                    this.Err.Equals(input.Err))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Ref != null)
                    hashCode = hashCode * 59 + this.Ref.GetHashCode();
                if (this.Cass != null)
                    hashCode = hashCode * 59 + this.Cass.GetHashCode();
                if (this.CBlk != null)
                    hashCode = hashCode * 59 + this.CBlk.GetHashCode();
                if (this.CTrc != null)
                    hashCode = hashCode * 59 + this.CTrc.GetHashCode();
                if (this.Cnty != null)
                    hashCode = hashCode * 59 + this.Cnty.GetHashCode();
                if (this.Feat != null)
                    hashCode = hashCode * 59 + this.Feat.GetHashCode();
                if (this.Fips != null)
                    hashCode = hashCode * 59 + this.Fips.GetHashCode();
                if (this.Inc != null)
                    hashCode = hashCode * 59 + this.Inc.GetHashCode();
                if (this.Jur != null)
                    hashCode = hashCode * 59 + this.Jur.GetHashCode();
                if (this.Lat != null)
                    hashCode = hashCode * 59 + this.Lat.GetHashCode();
                if (this.Long != null)
                    hashCode = hashCode * 59 + this.Long.GetHashCode();
                if (this.Pcd != null)
                    hashCode = hashCode * 59 + this.Pcd.GetHashCode();
                if (this.Scr != null)
                    hashCode = hashCode * 59 + this.Scr.GetHashCode();
                if (this.Err != null)
                    hashCode = hashCode * 59 + this.Err.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}