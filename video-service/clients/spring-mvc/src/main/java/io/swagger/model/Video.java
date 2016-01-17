package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-01-16T17:37:22.308-08:00")
public class Video  {
  
  private String description = null;
  private Long id = null;
  private String identifier = null;
  private String provider = null;
  private String title = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(description, video.description) &&
        Objects.equals(id, video.id) &&
        Objects.equals(identifier, video.identifier) &&
        Objects.equals(provider, video.provider) &&
        Objects.equals(title, video.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, identifier, provider, title);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  identifier: ").append(identifier).append("\n");
    sb.append("  provider: ").append(provider).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
