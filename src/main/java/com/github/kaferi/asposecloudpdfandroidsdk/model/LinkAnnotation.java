/**
 *
 *   Copyright (c) 2018 Aspose.Pdf for Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


package com.github.kaferi.asposecloudpdfandroidsdk.model;

import java.util.Objects;
import com.github.kaferi.asposecloudpdfandroidsdk.model.Color;
import com.github.kaferi.asposecloudpdfandroidsdk.model.Link;
import com.github.kaferi.asposecloudpdfandroidsdk.model.LinkActionType;
import com.github.kaferi.asposecloudpdfandroidsdk.model.LinkElement;
import com.github.kaferi.asposecloudpdfandroidsdk.model.LinkHighlightingMode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Provides link to linkAnnotation.
 */
@ApiModel(description = "Provides link to linkAnnotation.")

public class LinkAnnotation extends LinkElement {
  @SerializedName("ActionType")
  private LinkActionType actionType = null;

  @SerializedName("Action")
  private String action = null;

  @SerializedName("Highlighting")
  private LinkHighlightingMode highlighting = null;

  @SerializedName("Color")
  private Color color = null;

  public LinkAnnotation actionType(LinkActionType actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  @ApiModelProperty(value = "")
  public LinkActionType getActionType() {
    return actionType;
  }

  public void setActionType(LinkActionType actionType) {
    this.actionType = actionType;
  }

  public LinkAnnotation action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public LinkAnnotation highlighting(LinkHighlightingMode highlighting) {
    this.highlighting = highlighting;
    return this;
  }

   /**
   * Get highlighting
   * @return highlighting
  **/
  @ApiModelProperty(value = "")
  public LinkHighlightingMode getHighlighting() {
    return highlighting;
  }

  public void setHighlighting(LinkHighlightingMode highlighting) {
    this.highlighting = highlighting;
  }

  public LinkAnnotation color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkAnnotation linkAnnotation = (LinkAnnotation) o;
    return Objects.equals(this.actionType, linkAnnotation.actionType) &&
        Objects.equals(this.action, linkAnnotation.action) &&
        Objects.equals(this.highlighting, linkAnnotation.highlighting) &&
        Objects.equals(this.color, linkAnnotation.color) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, action, highlighting, color, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    highlighting: ").append(toIndentedString(highlighting)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

