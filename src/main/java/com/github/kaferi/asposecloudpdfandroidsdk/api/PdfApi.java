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


package com.github.kaferi.asposecloudpdfandroidsdk.api;

import com.github.kaferi.asposecloudpdfandroidsdk.ApiCallback;
import com.github.kaferi.asposecloudpdfandroidsdk.ApiClient;
import com.github.kaferi.asposecloudpdfandroidsdk.ApiException;
import com.github.kaferi.asposecloudpdfandroidsdk.ApiResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.Configuration;
import com.github.kaferi.asposecloudpdfandroidsdk.Pair;
import com.github.kaferi.asposecloudpdfandroidsdk.ProgressRequestBody;
import com.github.kaferi.asposecloudpdfandroidsdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.kaferi.asposecloudpdfandroidsdk.model.AnnotationResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.AnnotationsResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.AppendDocument;
import com.github.kaferi.asposecloudpdfandroidsdk.model.AttachmentResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.AttachmentsResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.DocumentPagesResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.DocumentPrivilege;
import com.github.kaferi.asposecloudpdfandroidsdk.model.DocumentPropertiesResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.DocumentProperty;
import com.github.kaferi.asposecloudpdfandroidsdk.model.DocumentPropertyResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.DocumentResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.DocumentTextReplaceResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.Field;
import com.github.kaferi.asposecloudpdfandroidsdk.model.FieldResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.Fields;
import com.github.kaferi.asposecloudpdfandroidsdk.model.FieldsResponse;
import java.io.File;
import com.github.kaferi.asposecloudpdfandroidsdk.model.ImageResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.ImagesListRequest;
import com.github.kaferi.asposecloudpdfandroidsdk.model.ImagesResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.LinkAnnotationResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.LinkAnnotationsResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.MergeDocuments;
import com.github.kaferi.asposecloudpdfandroidsdk.model.OptimizeOptions;
import com.github.kaferi.asposecloudpdfandroidsdk.model.PageTextReplaceResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.Paragraph;
import com.github.kaferi.asposecloudpdfandroidsdk.model.SaaSposeResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.Signature;
import com.github.kaferi.asposecloudpdfandroidsdk.model.SignatureVerifyResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.SplitResultResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.Stamp;
import com.github.kaferi.asposecloudpdfandroidsdk.model.TextFormatResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.TextItemResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.TextItemsResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.TextRectsResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.TextReplaceListRequest;
import com.github.kaferi.asposecloudpdfandroidsdk.model.TextReplaceRequest;
import com.github.kaferi.asposecloudpdfandroidsdk.model.TextReplaceResponse;
import com.github.kaferi.asposecloudpdfandroidsdk.model.TiffExportOptions;
import com.github.kaferi.asposecloudpdfandroidsdk.model.WordCountResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PdfApi {
    private ApiClient apiClient;

    public PdfApi(String appKey, String appSid) {
        this(Configuration.getDefaultApiClient());
        apiClient.setAppKey(appKey);
        apiClient.setAppSid(appSid);
    }

    public PdfApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteField
     * @param name The document name. (required)
     * @param fieldName The field name/ (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFieldCall(String name, String fieldName, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/fields/{fieldName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "fieldName" + "\\}", apiClient.escapeString(fieldName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFieldValidateBeforeCall(String name, String fieldName, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteField(Async)");
        }
        
        // verify the required parameter 'fieldName' is set
        if (fieldName == null) {
            throw new ApiException("Missing the required parameter 'fieldName' when calling deleteField(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteFieldCall(name, fieldName, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete document field by name.
     * 
     * @param name The document name. (required)
     * @param fieldName The field name/ (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse deleteField(String name, String fieldName, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = deleteFieldWithHttpInfo(name, fieldName, storage, folder);
        return resp.getData();
    }

    /**
     * Delete document field by name.
     * 
     * @param name The document name. (required)
     * @param fieldName The field name/ (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> deleteFieldWithHttpInfo(String name, String fieldName, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = deleteFieldValidateBeforeCall(name, fieldName, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete document field by name. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param fieldName The field name/ (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFieldAsync(String name, String fieldName, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteFieldValidateBeforeCall(name, fieldName, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deletePage
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePageCall(String name, Integer pageNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePageValidateBeforeCall(String name, Integer pageNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deletePage(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling deletePage(Async)");
        }
        

        com.squareup.okhttp.Call call = deletePageCall(name, pageNumber, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete document page by its number.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse deletePage(String name, Integer pageNumber, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = deletePageWithHttpInfo(name, pageNumber, storage, folder);
        return resp.getData();
    }

    /**
     * Delete document page by its number.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> deletePageWithHttpInfo(String name, Integer pageNumber, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = deletePageValidateBeforeCall(name, pageNumber, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete document page by its number. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePageAsync(String name, Integer pageNumber, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deletePageValidateBeforeCall(name, pageNumber, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteProperties
     * @param name  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePropertiesCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/documentproperties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePropertiesValidateBeforeCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteProperties(Async)");
        }
        

        com.squareup.okhttp.Call call = deletePropertiesCall(name, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete custom document properties.
     * 
     * @param name  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse deleteProperties(String name, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = deletePropertiesWithHttpInfo(name, storage, folder);
        return resp.getData();
    }

    /**
     * Delete custom document properties.
     * 
     * @param name  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> deletePropertiesWithHttpInfo(String name, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = deletePropertiesValidateBeforeCall(name, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete custom document properties. (asynchronously)
     * 
     * @param name  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePropertiesAsync(String name, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deletePropertiesValidateBeforeCall(name, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteProperty
     * @param name  (required)
     * @param propertyName  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePropertyCall(String name, String propertyName, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePropertyValidateBeforeCall(String name, String propertyName, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling deleteProperty(Async)");
        }
        

        com.squareup.okhttp.Call call = deletePropertyCall(name, propertyName, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete document property.
     * 
     * @param name  (required)
     * @param propertyName  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse deleteProperty(String name, String propertyName, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = deletePropertyWithHttpInfo(name, propertyName, storage, folder);
        return resp.getData();
    }

    /**
     * Delete document property.
     * 
     * @param name  (required)
     * @param propertyName  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> deletePropertyWithHttpInfo(String name, String propertyName, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = deletePropertyValidateBeforeCall(name, propertyName, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete document property. (asynchronously)
     * 
     * @param name  (required)
     * @param propertyName  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePropertyAsync(String name, String propertyName, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deletePropertyValidateBeforeCall(name, propertyName, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocument
     * @param name The document name. (required)
     * @param format The format to convert. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param outPath Path to save result (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getDocumentCall(String name, String format, String storage, String folder, String outPath, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentValidateBeforeCall(String name, String format, String storage, String folder, String outPath, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = getDocumentCall(name, format, storage, folder, outPath, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read common document info or convert to some format if the format specified.
     * 
     * @param name The document name. (required)
     * @param format The format to convert. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param outPath Path to save result (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public File getDocument(String name, String format, String storage, String folder, String outPath) throws ApiException {
        ApiResponse<File> resp = getDocumentWithHttpInfo(name, format, storage, folder, outPath);
        return resp.getData();
    }

    /**
     * Read common document info or convert to some format if the format specified.
     * 
     * @param name The document name. (required)
     * @param format The format to convert. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param outPath Path to save result (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<File> getDocumentWithHttpInfo(String name, String format, String storage, String folder, String outPath) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentValidateBeforeCall(name, format, storage, folder, outPath, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read common document info or convert to some format if the format specified. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param format The format to convert. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param outPath Path to save result (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getDocumentAsync(String name, String format, String storage, String folder, String outPath, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentValidateBeforeCall(name, format, storage, folder, outPath, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentAttachmentByIndex
     * @param name The document name. (required)
     * @param attachmentIndex The attachment index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentAttachmentByIndexCall(String name, Integer attachmentIndex, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/attachments/{attachmentIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "attachmentIndex" + "\\}", apiClient.escapeString(attachmentIndex.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentAttachmentByIndexValidateBeforeCall(String name, Integer attachmentIndex, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getDocumentAttachmentByIndex(Async)");
        }
        
        // verify the required parameter 'attachmentIndex' is set
        if (attachmentIndex == null) {
            throw new ApiException("Missing the required parameter 'attachmentIndex' when calling getDocumentAttachmentByIndex(Async)");
        }
        

        com.squareup.okhttp.Call call = getDocumentAttachmentByIndexCall(name, attachmentIndex, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document attachment info by its index.
     * 
     * @param name The document name. (required)
     * @param attachmentIndex The attachment index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return AttachmentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AttachmentResponse getDocumentAttachmentByIndex(String name, Integer attachmentIndex, String storage, String folder) throws ApiException {
        ApiResponse<AttachmentResponse> resp = getDocumentAttachmentByIndexWithHttpInfo(name, attachmentIndex, storage, folder);
        return resp.getData();
    }

    /**
     * Read document attachment info by its index.
     * 
     * @param name The document name. (required)
     * @param attachmentIndex The attachment index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;AttachmentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AttachmentResponse> getDocumentAttachmentByIndexWithHttpInfo(String name, Integer attachmentIndex, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentAttachmentByIndexValidateBeforeCall(name, attachmentIndex, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<AttachmentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document attachment info by its index. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param attachmentIndex The attachment index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentAttachmentByIndexAsync(String name, Integer attachmentIndex, String storage, String folder, final ApiCallback<AttachmentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentAttachmentByIndexValidateBeforeCall(name, attachmentIndex, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AttachmentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentAttachments
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentAttachmentsCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/attachments"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentAttachmentsValidateBeforeCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getDocumentAttachments(Async)");
        }
        

        com.squareup.okhttp.Call call = getDocumentAttachmentsCall(name, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document attachments info.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return AttachmentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AttachmentsResponse getDocumentAttachments(String name, String storage, String folder) throws ApiException {
        ApiResponse<AttachmentsResponse> resp = getDocumentAttachmentsWithHttpInfo(name, storage, folder);
        return resp.getData();
    }

    /**
     * Read document attachments info.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;AttachmentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AttachmentsResponse> getDocumentAttachmentsWithHttpInfo(String name, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentAttachmentsValidateBeforeCall(name, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<AttachmentsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document attachments info. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentAttachmentsAsync(String name, String storage, String folder, final ApiCallback<AttachmentsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentAttachmentsValidateBeforeCall(name, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AttachmentsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentBookmarks
     * @param name The document name. (required)
     * @param bookmarkPath The bookmark path. Leave it empty if you want to get all the bookmarks in the document. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentBookmarksCall(String name, String bookmarkPath, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/bookmarks"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (bookmarkPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("bookmarkPath", bookmarkPath));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentBookmarksValidateBeforeCall(String name, String bookmarkPath, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getDocumentBookmarks(Async)");
        }
        

        com.squareup.okhttp.Call call = getDocumentBookmarksCall(name, bookmarkPath, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document bookmark/bookmarks (including children).
     * 
     * @param name The document name. (required)
     * @param bookmarkPath The bookmark path. Leave it empty if you want to get all the bookmarks in the document. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDocumentBookmarks(String name, String bookmarkPath, String storage, String folder) throws ApiException {
        ApiResponse<File> resp = getDocumentBookmarksWithHttpInfo(name, bookmarkPath, storage, folder);
        return resp.getData();
    }

    /**
     * Read document bookmark/bookmarks (including children).
     * 
     * @param name The document name. (required)
     * @param bookmarkPath The bookmark path. Leave it empty if you want to get all the bookmarks in the document. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getDocumentBookmarksWithHttpInfo(String name, String bookmarkPath, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentBookmarksValidateBeforeCall(name, bookmarkPath, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document bookmark/bookmarks (including children). (asynchronously)
     * 
     * @param name The document name. (required)
     * @param bookmarkPath The bookmark path. Leave it empty if you want to get all the bookmarks in the document. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentBookmarksAsync(String name, String bookmarkPath, String storage, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentBookmarksValidateBeforeCall(name, bookmarkPath, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentProperties
     * @param name  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentPropertiesCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/documentproperties"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentPropertiesValidateBeforeCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getDocumentProperties(Async)");
        }
        

        com.squareup.okhttp.Call call = getDocumentPropertiesCall(name, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document properties.
     * 
     * @param name  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return DocumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertiesResponse getDocumentProperties(String name, String storage, String folder) throws ApiException {
        ApiResponse<DocumentPropertiesResponse> resp = getDocumentPropertiesWithHttpInfo(name, storage, folder);
        return resp.getData();
    }

    /**
     * Read document properties.
     * 
     * @param name  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;DocumentPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentPropertiesResponse> getDocumentPropertiesWithHttpInfo(String name, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentPropertiesValidateBeforeCall(name, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<DocumentPropertiesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document properties. (asynchronously)
     * 
     * @param name  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentPropertiesAsync(String name, String storage, String folder, final ApiCallback<DocumentPropertiesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentPropertiesValidateBeforeCall(name, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentPropertiesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDocumentProperty
     * @param name  (required)
     * @param propertyName  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDocumentPropertyCall(String name, String propertyName, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDocumentPropertyValidateBeforeCall(String name, String propertyName, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getDocumentProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling getDocumentProperty(Async)");
        }
        

        com.squareup.okhttp.Call call = getDocumentPropertyCall(name, propertyName, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document property by name.
     * 
     * @param name  (required)
     * @param propertyName  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return DocumentPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertyResponse getDocumentProperty(String name, String propertyName, String storage, String folder) throws ApiException {
        ApiResponse<DocumentPropertyResponse> resp = getDocumentPropertyWithHttpInfo(name, propertyName, storage, folder);
        return resp.getData();
    }

    /**
     * Read document property by name.
     * 
     * @param name  (required)
     * @param propertyName  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;DocumentPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentPropertyResponse> getDocumentPropertyWithHttpInfo(String name, String propertyName, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getDocumentPropertyValidateBeforeCall(name, propertyName, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<DocumentPropertyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document property by name. (asynchronously)
     * 
     * @param name  (required)
     * @param propertyName  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDocumentPropertyAsync(String name, String propertyName, String storage, String folder, final ApiCallback<DocumentPropertyResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDocumentPropertyValidateBeforeCall(name, propertyName, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentPropertyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDownload
     * @param path Path of the file including the file name and extension e.g. /file.ext (required)
     * @param versionId File&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDownloadCall(String path, String versionId, String storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/storage/file";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("path", path));
        if (versionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("versionId", versionId));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDownloadValidateBeforeCall(String path, String versionId, String storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getDownload(Async)");
        }
        

        com.squareup.okhttp.Call call = getDownloadCall(path, versionId, storage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Download a specific file 
     * 
     * @param path Path of the file including the file name and extension e.g. /file.ext (required)
     * @param versionId File&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDownload(String path, String versionId, String storage) throws ApiException {
        ApiResponse<File> resp = getDownloadWithHttpInfo(path, versionId, storage);
        return resp.getData();
    }

    /**
     * Download a specific file 
     * 
     * @param path Path of the file including the file name and extension e.g. /file.ext (required)
     * @param versionId File&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getDownloadWithHttpInfo(String path, String versionId, String storage) throws ApiException {
        com.squareup.okhttp.Call call = getDownloadValidateBeforeCall(path, versionId, storage, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download a specific file  (asynchronously)
     * 
     * @param path Path of the file including the file name and extension e.g. /file.ext (required)
     * @param versionId File&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDownloadAsync(String path, String versionId, String storage, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDownloadValidateBeforeCall(path, versionId, storage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDownloadDocumentAttachmentByIndex
     * @param name The document name. (required)
     * @param attachmentIndex The attachment index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDownloadDocumentAttachmentByIndexCall(String name, Integer attachmentIndex, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/attachments/{attachmentIndex}/download"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "attachmentIndex" + "\\}", apiClient.escapeString(attachmentIndex.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDownloadDocumentAttachmentByIndexValidateBeforeCall(String name, Integer attachmentIndex, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getDownloadDocumentAttachmentByIndex(Async)");
        }
        
        // verify the required parameter 'attachmentIndex' is set
        if (attachmentIndex == null) {
            throw new ApiException("Missing the required parameter 'attachmentIndex' when calling getDownloadDocumentAttachmentByIndex(Async)");
        }
        

        com.squareup.okhttp.Call call = getDownloadDocumentAttachmentByIndexCall(name, attachmentIndex, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Download document attachment content by its index.
     * 
     * @param name The document name. (required)
     * @param attachmentIndex The attachment index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDownloadDocumentAttachmentByIndex(String name, Integer attachmentIndex, String storage, String folder) throws ApiException {
        ApiResponse<File> resp = getDownloadDocumentAttachmentByIndexWithHttpInfo(name, attachmentIndex, storage, folder);
        return resp.getData();
    }

    /**
     * Download document attachment content by its index.
     * 
     * @param name The document name. (required)
     * @param attachmentIndex The attachment index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getDownloadDocumentAttachmentByIndexWithHttpInfo(String name, Integer attachmentIndex, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getDownloadDocumentAttachmentByIndexValidateBeforeCall(name, attachmentIndex, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download document attachment content by its index. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param attachmentIndex The attachment index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDownloadDocumentAttachmentByIndexAsync(String name, Integer attachmentIndex, String storage, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDownloadDocumentAttachmentByIndexValidateBeforeCall(name, attachmentIndex, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getField
     * @param name The document name. (required)
     * @param fieldName The field name/ (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFieldCall(String name, String fieldName, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/fields/{fieldName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "fieldName" + "\\}", apiClient.escapeString(fieldName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFieldValidateBeforeCall(String name, String fieldName, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getField(Async)");
        }
        
        // verify the required parameter 'fieldName' is set
        if (fieldName == null) {
            throw new ApiException("Missing the required parameter 'fieldName' when calling getField(Async)");
        }
        

        com.squareup.okhttp.Call call = getFieldCall(name, fieldName, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get document field by name.
     * 
     * @param name The document name. (required)
     * @param fieldName The field name/ (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return FieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FieldResponse getField(String name, String fieldName, String storage, String folder) throws ApiException {
        ApiResponse<FieldResponse> resp = getFieldWithHttpInfo(name, fieldName, storage, folder);
        return resp.getData();
    }

    /**
     * Get document field by name.
     * 
     * @param name The document name. (required)
     * @param fieldName The field name/ (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;FieldResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FieldResponse> getFieldWithHttpInfo(String name, String fieldName, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getFieldValidateBeforeCall(name, fieldName, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<FieldResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get document field by name. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param fieldName The field name/ (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFieldAsync(String name, String fieldName, String storage, String folder, final ApiCallback<FieldResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFieldValidateBeforeCall(name, fieldName, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FieldResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFields
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFieldsCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/fields"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFieldsValidateBeforeCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getFields(Async)");
        }
        

        com.squareup.okhttp.Call call = getFieldsCall(name, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get document fields.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return FieldsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FieldsResponse getFields(String name, String storage, String folder) throws ApiException {
        ApiResponse<FieldsResponse> resp = getFieldsWithHttpInfo(name, storage, folder);
        return resp.getData();
    }

    /**
     * Get document fields.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;FieldsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FieldsResponse> getFieldsWithHttpInfo(String name, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getFieldsValidateBeforeCall(name, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<FieldsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get document fields. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFieldsAsync(String name, String storage, String folder, final ApiCallback<FieldsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFieldsValidateBeforeCall(name, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FieldsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFragment
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getFragmentCall(String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()))
            .replaceAll("\\{" + "fragmentNumber" + "\\}", apiClient.escapeString(fragmentNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (withEmpty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("withEmpty", withEmpty));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFragmentValidateBeforeCall(String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getFragment(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getFragment(Async)");
        }
        
        // verify the required parameter 'fragmentNumber' is set
        if (fragmentNumber == null) {
            throw new ApiException("Missing the required parameter 'fragmentNumber' when calling getFragment(Async)");
        }
        

        com.squareup.okhttp.Call call = getFragmentCall(name, pageNumber, fragmentNumber, withEmpty, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read page fragment.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return TextItemsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public TextItemsResponse getFragment(String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder) throws ApiException {
        ApiResponse<TextItemsResponse> resp = getFragmentWithHttpInfo(name, pageNumber, fragmentNumber, withEmpty, storage, folder);
        return resp.getData();
    }

    /**
     * Read page fragment.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;TextItemsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<TextItemsResponse> getFragmentWithHttpInfo(String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getFragmentValidateBeforeCall(name, pageNumber, fragmentNumber, withEmpty, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<TextItemsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read page fragment. (asynchronously)
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getFragmentAsync(String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder, final ApiCallback<TextItemsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFragmentValidateBeforeCall(name, pageNumber, fragmentNumber, withEmpty, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextItemsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFragmentTextFormat
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getFragmentTextFormatCall(String name, Integer pageNumber, Integer fragmentNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/textFormat"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()))
            .replaceAll("\\{" + "fragmentNumber" + "\\}", apiClient.escapeString(fragmentNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFragmentTextFormatValidateBeforeCall(String name, Integer pageNumber, Integer fragmentNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getFragmentTextFormat(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getFragmentTextFormat(Async)");
        }
        
        // verify the required parameter 'fragmentNumber' is set
        if (fragmentNumber == null) {
            throw new ApiException("Missing the required parameter 'fragmentNumber' when calling getFragmentTextFormat(Async)");
        }
        

        com.squareup.okhttp.Call call = getFragmentTextFormatCall(name, pageNumber, fragmentNumber, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read page fragment text format.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return TextFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public TextFormatResponse getFragmentTextFormat(String name, Integer pageNumber, Integer fragmentNumber, String storage, String folder) throws ApiException {
        ApiResponse<TextFormatResponse> resp = getFragmentTextFormatWithHttpInfo(name, pageNumber, fragmentNumber, storage, folder);
        return resp.getData();
    }

    /**
     * Read page fragment text format.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;TextFormatResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<TextFormatResponse> getFragmentTextFormatWithHttpInfo(String name, Integer pageNumber, Integer fragmentNumber, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getFragmentTextFormatValidateBeforeCall(name, pageNumber, fragmentNumber, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<TextFormatResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read page fragment text format. (asynchronously)
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getFragmentTextFormatAsync(String name, Integer pageNumber, Integer fragmentNumber, String storage, String folder, final ApiCallback<TextFormatResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFragmentTextFormatValidateBeforeCall(name, pageNumber, fragmentNumber, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextFormatResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFragments
     * @param name  (required)
     * @param pageNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getFragmentsCall(String name, Integer pageNumber, String withEmpty, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/fragments"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (withEmpty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("withEmpty", withEmpty));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFragmentsValidateBeforeCall(String name, Integer pageNumber, String withEmpty, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getFragments(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getFragments(Async)");
        }
        

        com.squareup.okhttp.Call call = getFragmentsCall(name, pageNumber, withEmpty, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read page fragments.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return TextItemsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public TextItemsResponse getFragments(String name, Integer pageNumber, String withEmpty, String storage, String folder) throws ApiException {
        ApiResponse<TextItemsResponse> resp = getFragmentsWithHttpInfo(name, pageNumber, withEmpty, storage, folder);
        return resp.getData();
    }

    /**
     * Read page fragments.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;TextItemsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<TextItemsResponse> getFragmentsWithHttpInfo(String name, Integer pageNumber, String withEmpty, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getFragmentsValidateBeforeCall(name, pageNumber, withEmpty, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<TextItemsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read page fragments. (asynchronously)
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getFragmentsAsync(String name, Integer pageNumber, String withEmpty, String storage, String folder, final ApiCallback<TextItemsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFragmentsValidateBeforeCall(name, pageNumber, withEmpty, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextItemsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getImage
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param imageNumber The image format. (required)
     * @param format Image format to convert, if not specified the common image data is read. (optional)
     * @param width The converted image width. (optional, default to 0)
     * @param height The converted image height. (optional, default to 0)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImageCall(String name, Integer pageNumber, Integer imageNumber, String format, Integer width, Integer height, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/images/{imageNumber}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()))
            .replaceAll("\\{" + "imageNumber" + "\\}", apiClient.escapeString(imageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("height", height));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImageValidateBeforeCall(String name, Integer pageNumber, Integer imageNumber, String format, Integer width, Integer height, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getImage(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getImage(Async)");
        }
        
        // verify the required parameter 'imageNumber' is set
        if (imageNumber == null) {
            throw new ApiException("Missing the required parameter 'imageNumber' when calling getImage(Async)");
        }
        

        com.squareup.okhttp.Call call = getImageCall(name, pageNumber, imageNumber, format, width, height, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Extract document image in format specified.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param imageNumber The image format. (required)
     * @param format Image format to convert, if not specified the common image data is read. (optional)
     * @param width The converted image width. (optional, default to 0)
     * @param height The converted image height. (optional, default to 0)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getImage(String name, Integer pageNumber, Integer imageNumber, String format, Integer width, Integer height, String storage, String folder) throws ApiException {
        ApiResponse<File> resp = getImageWithHttpInfo(name, pageNumber, imageNumber, format, width, height, storage, folder);
        return resp.getData();
    }

    /**
     * Extract document image in format specified.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param imageNumber The image format. (required)
     * @param format Image format to convert, if not specified the common image data is read. (optional)
     * @param width The converted image width. (optional, default to 0)
     * @param height The converted image height. (optional, default to 0)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getImageWithHttpInfo(String name, Integer pageNumber, Integer imageNumber, String format, Integer width, Integer height, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getImageValidateBeforeCall(name, pageNumber, imageNumber, format, width, height, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Extract document image in format specified. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param imageNumber The image format. (required)
     * @param format Image format to convert, if not specified the common image data is read. (optional)
     * @param width The converted image width. (optional, default to 0)
     * @param height The converted image height. (optional, default to 0)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImageAsync(String name, Integer pageNumber, Integer imageNumber, String format, Integer width, Integer height, String storage, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImageValidateBeforeCall(name, pageNumber, imageNumber, format, width, height, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getImages
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImagesCall(String name, Integer pageNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/images"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImagesValidateBeforeCall(String name, Integer pageNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getImages(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getImages(Async)");
        }
        

        com.squareup.okhttp.Call call = getImagesCall(name, pageNumber, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document images.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ImagesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagesResponse getImages(String name, Integer pageNumber, String storage, String folder) throws ApiException {
        ApiResponse<ImagesResponse> resp = getImagesWithHttpInfo(name, pageNumber, storage, folder);
        return resp.getData();
    }

    /**
     * Read document images.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;ImagesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImagesResponse> getImagesWithHttpInfo(String name, Integer pageNumber, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getImagesValidateBeforeCall(name, pageNumber, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<ImagesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document images. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImagesAsync(String name, Integer pageNumber, String storage, String folder, final ApiCallback<ImagesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImagesValidateBeforeCall(name, pageNumber, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImagesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPage
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param format The format to convert if specified. (optional)
     * @param width The converted image width. (optional, default to 0)
     * @param height The converted image height. (optional, default to 0)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPageCall(String name, Integer pageNumber, String format, Integer width, Integer height, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("height", height));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPageValidateBeforeCall(String name, Integer pageNumber, String format, Integer width, Integer height, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPage(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getPage(Async)");
        }
        

        com.squareup.okhttp.Call call = getPageCall(name, pageNumber, format, width, height, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Convert document page to format specified.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param format The format to convert if specified. (optional)
     * @param width The converted image width. (optional, default to 0)
     * @param height The converted image height. (optional, default to 0)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPage(String name, Integer pageNumber, String format, Integer width, Integer height, String storage, String folder) throws ApiException {
        ApiResponse<File> resp = getPageWithHttpInfo(name, pageNumber, format, width, height, storage, folder);
        return resp.getData();
    }

    /**
     * Convert document page to format specified.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param format The format to convert if specified. (optional)
     * @param width The converted image width. (optional, default to 0)
     * @param height The converted image height. (optional, default to 0)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPageWithHttpInfo(String name, Integer pageNumber, String format, Integer width, Integer height, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPageValidateBeforeCall(name, pageNumber, format, width, height, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Convert document page to format specified. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param format The format to convert if specified. (optional)
     * @param width The converted image width. (optional, default to 0)
     * @param height The converted image height. (optional, default to 0)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPageAsync(String name, Integer pageNumber, String format, Integer width, Integer height, String storage, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPageValidateBeforeCall(name, pageNumber, format, width, height, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPageAnnotation
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param annotationNumber The annotation number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPageAnnotationCall(String name, Integer pageNumber, Integer annotationNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/annotations/{annotationNumber}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()))
            .replaceAll("\\{" + "annotationNumber" + "\\}", apiClient.escapeString(annotationNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPageAnnotationValidateBeforeCall(String name, Integer pageNumber, Integer annotationNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPageAnnotation(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getPageAnnotation(Async)");
        }
        
        // verify the required parameter 'annotationNumber' is set
        if (annotationNumber == null) {
            throw new ApiException("Missing the required parameter 'annotationNumber' when calling getPageAnnotation(Async)");
        }
        

        com.squareup.okhttp.Call call = getPageAnnotationCall(name, pageNumber, annotationNumber, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document page annotation by its number.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param annotationNumber The annotation number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return AnnotationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnnotationResponse getPageAnnotation(String name, Integer pageNumber, Integer annotationNumber, String storage, String folder) throws ApiException {
        ApiResponse<AnnotationResponse> resp = getPageAnnotationWithHttpInfo(name, pageNumber, annotationNumber, storage, folder);
        return resp.getData();
    }

    /**
     * Read document page annotation by its number.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param annotationNumber The annotation number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;AnnotationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnnotationResponse> getPageAnnotationWithHttpInfo(String name, Integer pageNumber, Integer annotationNumber, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPageAnnotationValidateBeforeCall(name, pageNumber, annotationNumber, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<AnnotationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document page annotation by its number. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param annotationNumber The annotation number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPageAnnotationAsync(String name, Integer pageNumber, Integer annotationNumber, String storage, String folder, final ApiCallback<AnnotationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPageAnnotationValidateBeforeCall(name, pageNumber, annotationNumber, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnnotationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPageAnnotations
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPageAnnotationsCall(String name, Integer pageNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/annotations"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPageAnnotationsValidateBeforeCall(String name, Integer pageNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPageAnnotations(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getPageAnnotations(Async)");
        }
        

        com.squareup.okhttp.Call call = getPageAnnotationsCall(name, pageNumber, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read documant page annotations.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return AnnotationsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnnotationsResponse getPageAnnotations(String name, Integer pageNumber, String storage, String folder) throws ApiException {
        ApiResponse<AnnotationsResponse> resp = getPageAnnotationsWithHttpInfo(name, pageNumber, storage, folder);
        return resp.getData();
    }

    /**
     * Read documant page annotations.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;AnnotationsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnnotationsResponse> getPageAnnotationsWithHttpInfo(String name, Integer pageNumber, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPageAnnotationsValidateBeforeCall(name, pageNumber, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<AnnotationsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read documant page annotations. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPageAnnotationsAsync(String name, Integer pageNumber, String storage, String folder, final ApiCallback<AnnotationsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPageAnnotationsValidateBeforeCall(name, pageNumber, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnnotationsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPageLinkAnnotationByIndex
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param linkIndex The link index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPageLinkAnnotationByIndexCall(String name, Integer pageNumber, Integer linkIndex, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/links/{linkIndex}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()))
            .replaceAll("\\{" + "linkIndex" + "\\}", apiClient.escapeString(linkIndex.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPageLinkAnnotationByIndexValidateBeforeCall(String name, Integer pageNumber, Integer linkIndex, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPageLinkAnnotationByIndex(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getPageLinkAnnotationByIndex(Async)");
        }
        
        // verify the required parameter 'linkIndex' is set
        if (linkIndex == null) {
            throw new ApiException("Missing the required parameter 'linkIndex' when calling getPageLinkAnnotationByIndex(Async)");
        }
        

        com.squareup.okhttp.Call call = getPageLinkAnnotationByIndexCall(name, pageNumber, linkIndex, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document page link annotation by its index.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param linkIndex The link index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return LinkAnnotationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LinkAnnotationResponse getPageLinkAnnotationByIndex(String name, Integer pageNumber, Integer linkIndex, String storage, String folder) throws ApiException {
        ApiResponse<LinkAnnotationResponse> resp = getPageLinkAnnotationByIndexWithHttpInfo(name, pageNumber, linkIndex, storage, folder);
        return resp.getData();
    }

    /**
     * Read document page link annotation by its index.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param linkIndex The link index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;LinkAnnotationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LinkAnnotationResponse> getPageLinkAnnotationByIndexWithHttpInfo(String name, Integer pageNumber, Integer linkIndex, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPageLinkAnnotationByIndexValidateBeforeCall(name, pageNumber, linkIndex, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<LinkAnnotationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document page link annotation by its index. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param linkIndex The link index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPageLinkAnnotationByIndexAsync(String name, Integer pageNumber, Integer linkIndex, String storage, String folder, final ApiCallback<LinkAnnotationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPageLinkAnnotationByIndexValidateBeforeCall(name, pageNumber, linkIndex, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LinkAnnotationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPageLinkAnnotations
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPageLinkAnnotationsCall(String name, Integer pageNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/links"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPageLinkAnnotationsValidateBeforeCall(String name, Integer pageNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPageLinkAnnotations(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getPageLinkAnnotations(Async)");
        }
        

        com.squareup.okhttp.Call call = getPageLinkAnnotationsCall(name, pageNumber, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document page link annotations.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return LinkAnnotationsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LinkAnnotationsResponse getPageLinkAnnotations(String name, Integer pageNumber, String storage, String folder) throws ApiException {
        ApiResponse<LinkAnnotationsResponse> resp = getPageLinkAnnotationsWithHttpInfo(name, pageNumber, storage, folder);
        return resp.getData();
    }

    /**
     * Read document page link annotations.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;LinkAnnotationsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LinkAnnotationsResponse> getPageLinkAnnotationsWithHttpInfo(String name, Integer pageNumber, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPageLinkAnnotationsValidateBeforeCall(name, pageNumber, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<LinkAnnotationsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document page link annotations. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPageLinkAnnotationsAsync(String name, Integer pageNumber, String storage, String folder, final ApiCallback<LinkAnnotationsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPageLinkAnnotationsValidateBeforeCall(name, pageNumber, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LinkAnnotationsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPageText
     * @param name The document name. (required)
     * @param pageNumber Number of page (starting from 1). (required)
     * @param X  (required)
     * @param Y  (required)
     * @param width  (required)
     * @param height  (required)
     * @param format List of formats for search. (optional)
     * @param regex Formats are specified as a regular expression. (optional)
     * @param splitRects Split result fragments (default is true). (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPageTextCall(String name, Integer pageNumber, Integer X, Integer Y, Integer width, Integer height, List<String> format, String regex, Boolean splitRects, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/text"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (format != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "format", format));
        if (regex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("regex", regex));
        if (X != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("X", X));
        if (Y != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Y", Y));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (splitRects != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("splitRects", splitRects));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPageTextValidateBeforeCall(String name, Integer pageNumber, Integer X, Integer Y, Integer width, Integer height, List<String> format, String regex, Boolean splitRects, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPageText(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getPageText(Async)");
        }
        
        // verify the required parameter 'X' is set
        if (X == null) {
            throw new ApiException("Missing the required parameter 'X' when calling getPageText(Async)");
        }
        
        // verify the required parameter 'Y' is set
        if (Y == null) {
            throw new ApiException("Missing the required parameter 'Y' when calling getPageText(Async)");
        }
        
        // verify the required parameter 'width' is set
        if (width == null) {
            throw new ApiException("Missing the required parameter 'width' when calling getPageText(Async)");
        }
        
        // verify the required parameter 'height' is set
        if (height == null) {
            throw new ApiException("Missing the required parameter 'height' when calling getPageText(Async)");
        }
        

        com.squareup.okhttp.Call call = getPageTextCall(name, pageNumber, X, Y, width, height, format, regex, splitRects, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read page text items.
     * 
     * @param name The document name. (required)
     * @param pageNumber Number of page (starting from 1). (required)
     * @param X  (required)
     * @param Y  (required)
     * @param width  (required)
     * @param height  (required)
     * @param format List of formats for search. (optional)
     * @param regex Formats are specified as a regular expression. (optional)
     * @param splitRects Split result fragments (default is true). (optional)
     * @param folder The document folder. (optional)
     * @return TextRectsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TextRectsResponse getPageText(String name, Integer pageNumber, Integer X, Integer Y, Integer width, Integer height, List<String> format, String regex, Boolean splitRects, String folder) throws ApiException {
        ApiResponse<TextRectsResponse> resp = getPageTextWithHttpInfo(name, pageNumber, X, Y, width, height, format, regex, splitRects, folder);
        return resp.getData();
    }

    /**
     * Read page text items.
     * 
     * @param name The document name. (required)
     * @param pageNumber Number of page (starting from 1). (required)
     * @param X  (required)
     * @param Y  (required)
     * @param width  (required)
     * @param height  (required)
     * @param format List of formats for search. (optional)
     * @param regex Formats are specified as a regular expression. (optional)
     * @param splitRects Split result fragments (default is true). (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;TextRectsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TextRectsResponse> getPageTextWithHttpInfo(String name, Integer pageNumber, Integer X, Integer Y, Integer width, Integer height, List<String> format, String regex, Boolean splitRects, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPageTextValidateBeforeCall(name, pageNumber, X, Y, width, height, format, regex, splitRects, folder, null, null);
        Type localVarReturnType = new TypeToken<TextRectsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read page text items. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber Number of page (starting from 1). (required)
     * @param X  (required)
     * @param Y  (required)
     * @param width  (required)
     * @param height  (required)
     * @param format List of formats for search. (optional)
     * @param regex Formats are specified as a regular expression. (optional)
     * @param splitRects Split result fragments (default is true). (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPageTextAsync(String name, Integer pageNumber, Integer X, Integer Y, Integer width, Integer height, List<String> format, String regex, Boolean splitRects, String folder, final ApiCallback<TextRectsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPageTextValidateBeforeCall(name, pageNumber, X, Y, width, height, format, regex, splitRects, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextRectsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPageTextItems
     * @param name  (required)
     * @param pageNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getPageTextItemsCall(String name, Integer pageNumber, String withEmpty, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/textItems"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (withEmpty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("withEmpty", withEmpty));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPageTextItemsValidateBeforeCall(String name, Integer pageNumber, String withEmpty, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPageTextItems(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getPageTextItems(Async)");
        }
        

        com.squareup.okhttp.Call call = getPageTextItemsCall(name, pageNumber, withEmpty, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read page text items.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return TextItemsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public TextItemsResponse getPageTextItems(String name, Integer pageNumber, String withEmpty, String storage, String folder) throws ApiException {
        ApiResponse<TextItemsResponse> resp = getPageTextItemsWithHttpInfo(name, pageNumber, withEmpty, storage, folder);
        return resp.getData();
    }

    /**
     * Read page text items.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;TextItemsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<TextItemsResponse> getPageTextItemsWithHttpInfo(String name, Integer pageNumber, String withEmpty, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPageTextItemsValidateBeforeCall(name, pageNumber, withEmpty, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<TextItemsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read page text items. (asynchronously)
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getPageTextItemsAsync(String name, Integer pageNumber, String withEmpty, String storage, String folder, final ApiCallback<TextItemsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPageTextItemsValidateBeforeCall(name, pageNumber, withEmpty, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextItemsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPages
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPagesCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPagesValidateBeforeCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPages(Async)");
        }
        

        com.squareup.okhttp.Call call = getPagesCall(name, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document pages info.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return DocumentPagesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPagesResponse getPages(String name, String storage, String folder) throws ApiException {
        ApiResponse<DocumentPagesResponse> resp = getPagesWithHttpInfo(name, storage, folder);
        return resp.getData();
    }

    /**
     * Read document pages info.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;DocumentPagesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentPagesResponse> getPagesWithHttpInfo(String name, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPagesValidateBeforeCall(name, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<DocumentPagesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document pages info. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPagesAsync(String name, String storage, String folder, final ApiCallback<DocumentPagesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPagesValidateBeforeCall(name, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentPagesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToDoc
     * @param name The document name. (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToDocCall(String name, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/doc"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (addReturnToLineEnd != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("addReturnToLineEnd", addReturnToLineEnd));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (imageResolutionX != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("imageResolutionX", imageResolutionX));
        if (imageResolutionY != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("imageResolutionY", imageResolutionY));
        if (maxDistanceBetweenTextLines != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxDistanceBetweenTextLines", maxDistanceBetweenTextLines));
        if (mode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mode", mode));
        if (recognizeBullets != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("recognizeBullets", recognizeBullets));
        if (relativeHorizontalProximity != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("relativeHorizontalProximity", relativeHorizontalProximity));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToDocValidateBeforeCall(String name, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToDoc(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToDocCall(name, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to DOC format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToDoc(String name, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToDocWithHttpInfo(name, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to DOC format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToDocWithHttpInfo(String name, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToDocValidateBeforeCall(name, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to DOC format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToDocAsync(String name, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToDocValidateBeforeCall(name, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToEpub
     * @param name The document name. (required)
     * @param contentRecognitionMode �roperty tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToEpubCall(String name, String contentRecognitionMode, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/epub"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (contentRecognitionMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("contentRecognitionMode", contentRecognitionMode));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToEpubValidateBeforeCall(String name, String contentRecognitionMode, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToEpub(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToEpubCall(name, contentRecognitionMode, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to EPUB format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param contentRecognitionMode �roperty tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToEpub(String name, String contentRecognitionMode, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToEpubWithHttpInfo(name, contentRecognitionMode, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to EPUB format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param contentRecognitionMode �roperty tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToEpubWithHttpInfo(String name, String contentRecognitionMode, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToEpubValidateBeforeCall(name, contentRecognitionMode, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to EPUB format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param contentRecognitionMode �roperty tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToEpubAsync(String name, String contentRecognitionMode, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToEpubValidateBeforeCall(name, contentRecognitionMode, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToHtml
     * @param name The document name. (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToHtmlCall(String name, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/html"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (additionalMarginWidthInPoints != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("additionalMarginWidthInPoints", additionalMarginWidthInPoints));
        if (compressSvgGraphicsIfAny != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("compressSvgGraphicsIfAny", compressSvgGraphicsIfAny));
        if (convertMarkedContentToLayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("convertMarkedContentToLayers", convertMarkedContentToLayers));
        if (defaultFontName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", defaultFontName));
        if (documentType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("documentType", documentType));
        if (fixedLayout != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fixedLayout", fixedLayout));
        if (imageResolution != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("imageResolution", imageResolution));
        if (minimalLineWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("minimalLineWidth", minimalLineWidth));
        if (preventGlyphsGrouping != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("preventGlyphsGrouping", preventGlyphsGrouping));
        if (splitCssIntoPages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("splitCssIntoPages", splitCssIntoPages));
        if (splitIntoPages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("splitIntoPages", splitIntoPages));
        if (useZOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("useZOrder", useZOrder));
        if (antialiasingProcessing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("antialiasingProcessing", antialiasingProcessing));
        if (cssClassNamesPrefix != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cssClassNamesPrefix", cssClassNamesPrefix));
        if (explicitListOfSavedPages != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "explicitListOfSavedPages", explicitListOfSavedPages));
        if (fontEncodingStrategy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fontEncodingStrategy", fontEncodingStrategy));
        if (fontSavingMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fontSavingMode", fontSavingMode));
        if (htmlMarkupGenerationMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("htmlMarkupGenerationMode", htmlMarkupGenerationMode));
        if (lettersPositioningMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lettersPositioningMethod", lettersPositioningMethod));
        if (pagesFlowTypeDependsOnViewersScreenSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pagesFlowTypeDependsOnViewersScreenSize", pagesFlowTypeDependsOnViewersScreenSize));
        if (partsEmbeddingMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("partsEmbeddingMode", partsEmbeddingMode));
        if (rasterImagesSavingMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("rasterImagesSavingMode", rasterImagesSavingMode));
        if (removeEmptyAreasOnTopAndBottom != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("removeEmptyAreasOnTopAndBottom", removeEmptyAreasOnTopAndBottom));
        if (saveShadowedTextsAsTransparentTexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("saveShadowedTextsAsTransparentTexts", saveShadowedTextsAsTransparentTexts));
        if (saveTransparentTexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("saveTransparentTexts", saveTransparentTexts));
        if (specialFolderForAllImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("specialFolderForAllImages", specialFolderForAllImages));
        if (specialFolderForSvgImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("specialFolderForSvgImages", specialFolderForSvgImages));
        if (trySaveTextUnderliningAndStrikeoutingInCss != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("trySaveTextUnderliningAndStrikeoutingInCss", trySaveTextUnderliningAndStrikeoutingInCss));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToHtmlValidateBeforeCall(String name, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToHtml(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToHtmlCall(name, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to Html format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToHtml(String name, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToHtmlWithHttpInfo(name, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to Html format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToHtmlWithHttpInfo(String name, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToHtmlValidateBeforeCall(name, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to Html format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToHtmlAsync(String name, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToHtmlValidateBeforeCall(name, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToLaTeX
     * @param name The document name. (required)
     * @param pagesCount Pages count. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToLaTeXCall(String name, Integer pagesCount, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/latex"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pagesCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pagesCount", pagesCount));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToLaTeXValidateBeforeCall(String name, Integer pagesCount, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToLaTeX(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToLaTeXCall(name, pagesCount, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to LaTeX format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param pagesCount Pages count. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToLaTeX(String name, Integer pagesCount, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToLaTeXWithHttpInfo(name, pagesCount, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to LaTeX format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param pagesCount Pages count. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToLaTeXWithHttpInfo(String name, Integer pagesCount, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToLaTeXValidateBeforeCall(name, pagesCount, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to LaTeX format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pagesCount Pages count. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToLaTeXAsync(String name, Integer pagesCount, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToLaTeXValidateBeforeCall(name, pagesCount, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToMobiXml
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToMobiXmlCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/mobixml"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToMobiXmlValidateBeforeCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToMobiXml(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToMobiXmlCall(name, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to MOBIXML format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToMobiXml(String name, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToMobiXmlWithHttpInfo(name, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to MOBIXML format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToMobiXmlWithHttpInfo(String name, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToMobiXmlValidateBeforeCall(name, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to MOBIXML format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToMobiXmlAsync(String name, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToMobiXmlValidateBeforeCall(name, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToPdfA
     * @param name The document name. (required)
     * @param type Type of PdfA format. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToPdfACall(String name, String type, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/pdfa"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToPdfAValidateBeforeCall(String name, String type, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToPdfA(Async)");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getPdfInStorageToPdfA(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToPdfACall(name, type, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to PdfA format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param type Type of PdfA format. (required)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToPdfA(String name, String type, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToPdfAWithHttpInfo(name, type, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to PdfA format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param type Type of PdfA format. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToPdfAWithHttpInfo(String name, String type, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToPdfAValidateBeforeCall(name, type, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to PdfA format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param type Type of PdfA format. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToPdfAAsync(String name, String type, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToPdfAValidateBeforeCall(name, type, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToPptx
     * @param name The document name. (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToPptxCall(String name, Boolean separateImages, Boolean slidesAsImages, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/pptx"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (separateImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("separateImages", separateImages));
        if (slidesAsImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("slidesAsImages", slidesAsImages));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToPptxValidateBeforeCall(String name, Boolean separateImages, Boolean slidesAsImages, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToPptx(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToPptxCall(name, separateImages, slidesAsImages, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to PPTX format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToPptx(String name, Boolean separateImages, Boolean slidesAsImages, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToPptxWithHttpInfo(name, separateImages, slidesAsImages, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to PPTX format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToPptxWithHttpInfo(String name, Boolean separateImages, Boolean slidesAsImages, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToPptxValidateBeforeCall(name, separateImages, slidesAsImages, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to PPTX format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToPptxAsync(String name, Boolean separateImages, Boolean slidesAsImages, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToPptxValidateBeforeCall(name, separateImages, slidesAsImages, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToSvg
     * @param name The document name. (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToSvgCall(String name, Boolean compressOutputToZipArchive, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/svg"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (compressOutputToZipArchive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("compressOutputToZipArchive", compressOutputToZipArchive));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToSvgValidateBeforeCall(String name, Boolean compressOutputToZipArchive, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToSvg(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToSvgCall(name, compressOutputToZipArchive, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to SVG format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToSvg(String name, Boolean compressOutputToZipArchive, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToSvgWithHttpInfo(name, compressOutputToZipArchive, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to SVG format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToSvgWithHttpInfo(String name, Boolean compressOutputToZipArchive, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToSvgValidateBeforeCall(name, compressOutputToZipArchive, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to SVG format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToSvgAsync(String name, Boolean compressOutputToZipArchive, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToSvgValidateBeforeCall(name, compressOutputToZipArchive, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToTiff
     * @param name The document name. (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToTiffCall(String name, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/tiff"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (brightness != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("brightness", brightness));
        if (compression != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("compression", compression));
        if (colorDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("colorDepth", colorDepth));
        if (leftMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("leftMargin", leftMargin));
        if (rightMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("rightMargin", rightMargin));
        if (topMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("topMargin", topMargin));
        if (bottomMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("bottomMargin", bottomMargin));
        if (orientation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orientation", orientation));
        if (skipBlankPages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skipBlankPages", skipBlankPages));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("height", height));
        if (xResolution != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("xResolution", xResolution));
        if (yResolution != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("yResolution", yResolution));
        if (pageIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageIndex", pageIndex));
        if (pageCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageCount", pageCount));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToTiffValidateBeforeCall(String name, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToTiff(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToTiffCall(name, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to TIFF format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToTiff(String name, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToTiffWithHttpInfo(name, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to TIFF format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToTiffWithHttpInfo(String name, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToTiffValidateBeforeCall(name, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to TIFF format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToTiffAsync(String name, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToTiffValidateBeforeCall(name, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToXls
     * @param name The document name. (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToXlsCall(String name, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/xls"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (insertBlankColumnAtFirst != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("insertBlankColumnAtFirst", insertBlankColumnAtFirst));
        if (minimizeTheNumberOfWorksheets != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("minimizeTheNumberOfWorksheets", minimizeTheNumberOfWorksheets));
        if (scaleFactor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("scaleFactor", scaleFactor));
        if (uniformWorksheets != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("uniformWorksheets", uniformWorksheets));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToXlsValidateBeforeCall(String name, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToXls(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToXlsCall(name, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to XLS format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToXls(String name, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToXlsWithHttpInfo(name, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to XLS format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToXlsWithHttpInfo(String name, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToXlsValidateBeforeCall(name, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to XLS format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToXlsAsync(String name, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToXlsValidateBeforeCall(name, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToXml
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToXmlCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/xml"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToXmlValidateBeforeCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToXml(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToXmlCall(name, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to XML format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToXml(String name, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToXmlWithHttpInfo(name, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to XML format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToXmlWithHttpInfo(String name, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToXmlValidateBeforeCall(name, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to XML format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToXmlAsync(String name, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToXmlValidateBeforeCall(name, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPdfInStorageToXps
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToXpsCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/xps"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPdfInStorageToXpsValidateBeforeCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPdfInStorageToXps(Async)");
        }
        

        com.squareup.okhttp.Call call = getPdfInStorageToXpsCall(name, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to XPS format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getPdfInStorageToXps(String name, String folder) throws ApiException {
        ApiResponse<File> resp = getPdfInStorageToXpsWithHttpInfo(name, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to XPS format and returns resulting file in response content
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getPdfInStorageToXpsWithHttpInfo(String name, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getPdfInStorageToXpsValidateBeforeCall(name, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to XPS format and returns resulting file in response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPdfInStorageToXpsAsync(String name, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPdfInStorageToXpsValidateBeforeCall(name, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSegment
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param segmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getSegmentCall(String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/segments/{segmentNumber}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()))
            .replaceAll("\\{" + "fragmentNumber" + "\\}", apiClient.escapeString(fragmentNumber.toString()))
            .replaceAll("\\{" + "segmentNumber" + "\\}", apiClient.escapeString(segmentNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSegmentValidateBeforeCall(String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSegment(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getSegment(Async)");
        }
        
        // verify the required parameter 'fragmentNumber' is set
        if (fragmentNumber == null) {
            throw new ApiException("Missing the required parameter 'fragmentNumber' when calling getSegment(Async)");
        }
        
        // verify the required parameter 'segmentNumber' is set
        if (segmentNumber == null) {
            throw new ApiException("Missing the required parameter 'segmentNumber' when calling getSegment(Async)");
        }
        

        com.squareup.okhttp.Call call = getSegmentCall(name, pageNumber, fragmentNumber, segmentNumber, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read segment.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param segmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return TextItemResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public TextItemResponse getSegment(String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder) throws ApiException {
        ApiResponse<TextItemResponse> resp = getSegmentWithHttpInfo(name, pageNumber, fragmentNumber, segmentNumber, storage, folder);
        return resp.getData();
    }

    /**
     * Read segment.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param segmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;TextItemResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<TextItemResponse> getSegmentWithHttpInfo(String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getSegmentValidateBeforeCall(name, pageNumber, fragmentNumber, segmentNumber, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<TextItemResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read segment. (asynchronously)
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param segmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getSegmentAsync(String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder, final ApiCallback<TextItemResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSegmentValidateBeforeCall(name, pageNumber, fragmentNumber, segmentNumber, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextItemResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSegmentTextFormat
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param segmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getSegmentTextFormatCall(String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/segments/{segmentNumber}/textformat"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()))
            .replaceAll("\\{" + "fragmentNumber" + "\\}", apiClient.escapeString(fragmentNumber.toString()))
            .replaceAll("\\{" + "segmentNumber" + "\\}", apiClient.escapeString(segmentNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSegmentTextFormatValidateBeforeCall(String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSegmentTextFormat(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getSegmentTextFormat(Async)");
        }
        
        // verify the required parameter 'fragmentNumber' is set
        if (fragmentNumber == null) {
            throw new ApiException("Missing the required parameter 'fragmentNumber' when calling getSegmentTextFormat(Async)");
        }
        
        // verify the required parameter 'segmentNumber' is set
        if (segmentNumber == null) {
            throw new ApiException("Missing the required parameter 'segmentNumber' when calling getSegmentTextFormat(Async)");
        }
        

        com.squareup.okhttp.Call call = getSegmentTextFormatCall(name, pageNumber, fragmentNumber, segmentNumber, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read segment text format.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param segmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return TextFormatResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public TextFormatResponse getSegmentTextFormat(String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder) throws ApiException {
        ApiResponse<TextFormatResponse> resp = getSegmentTextFormatWithHttpInfo(name, pageNumber, fragmentNumber, segmentNumber, storage, folder);
        return resp.getData();
    }

    /**
     * Read segment text format.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param segmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;TextFormatResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<TextFormatResponse> getSegmentTextFormatWithHttpInfo(String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getSegmentTextFormatValidateBeforeCall(name, pageNumber, fragmentNumber, segmentNumber, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<TextFormatResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read segment text format. (asynchronously)
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param segmentNumber  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getSegmentTextFormatAsync(String name, Integer pageNumber, Integer fragmentNumber, Integer segmentNumber, String storage, String folder, final ApiCallback<TextFormatResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSegmentTextFormatValidateBeforeCall(name, pageNumber, fragmentNumber, segmentNumber, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextFormatResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSegments
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getSegmentsCall(String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/segments"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()))
            .replaceAll("\\{" + "fragmentNumber" + "\\}", apiClient.escapeString(fragmentNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (withEmpty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("withEmpty", withEmpty));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSegmentsValidateBeforeCall(String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSegments(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getSegments(Async)");
        }
        
        // verify the required parameter 'fragmentNumber' is set
        if (fragmentNumber == null) {
            throw new ApiException("Missing the required parameter 'fragmentNumber' when calling getSegments(Async)");
        }
        

        com.squareup.okhttp.Call call = getSegmentsCall(name, pageNumber, fragmentNumber, withEmpty, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read fragment segments.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return TextItemsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public TextItemsResponse getSegments(String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder) throws ApiException {
        ApiResponse<TextItemsResponse> resp = getSegmentsWithHttpInfo(name, pageNumber, fragmentNumber, withEmpty, storage, folder);
        return resp.getData();
    }

    /**
     * Read fragment segments.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;TextItemsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<TextItemsResponse> getSegmentsWithHttpInfo(String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getSegmentsValidateBeforeCall(name, pageNumber, fragmentNumber, withEmpty, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<TextItemsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read fragment segments. (asynchronously)
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param fragmentNumber  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getSegmentsAsync(String name, Integer pageNumber, Integer fragmentNumber, String withEmpty, String storage, String folder, final ApiCallback<TextItemsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSegmentsValidateBeforeCall(name, pageNumber, fragmentNumber, withEmpty, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextItemsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getText
     * @param name The document name. (required)
     * @param X  (required)
     * @param Y  (required)
     * @param width  (required)
     * @param height  (required)
     * @param format List of formats for search. (optional)
     * @param regex Formats are specified as a regular expression. (optional)
     * @param splitRects Split result fragments (default is true). (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTextCall(String name, Integer X, Integer Y, Integer width, Integer height, List<String> format, String regex, Boolean splitRects, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/text"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (format != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "format", format));
        if (regex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("regex", regex));
        if (X != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("X", X));
        if (Y != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Y", Y));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (splitRects != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("splitRects", splitRects));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTextValidateBeforeCall(String name, Integer X, Integer Y, Integer width, Integer height, List<String> format, String regex, Boolean splitRects, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getText(Async)");
        }
        
        // verify the required parameter 'X' is set
        if (X == null) {
            throw new ApiException("Missing the required parameter 'X' when calling getText(Async)");
        }
        
        // verify the required parameter 'Y' is set
        if (Y == null) {
            throw new ApiException("Missing the required parameter 'Y' when calling getText(Async)");
        }
        
        // verify the required parameter 'width' is set
        if (width == null) {
            throw new ApiException("Missing the required parameter 'width' when calling getText(Async)");
        }
        
        // verify the required parameter 'height' is set
        if (height == null) {
            throw new ApiException("Missing the required parameter 'height' when calling getText(Async)");
        }
        

        com.squareup.okhttp.Call call = getTextCall(name, X, Y, width, height, format, regex, splitRects, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document text.
     * 
     * @param name The document name. (required)
     * @param X  (required)
     * @param Y  (required)
     * @param width  (required)
     * @param height  (required)
     * @param format List of formats for search. (optional)
     * @param regex Formats are specified as a regular expression. (optional)
     * @param splitRects Split result fragments (default is true). (optional)
     * @param folder The document folder. (optional)
     * @return TextRectsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TextRectsResponse getText(String name, Integer X, Integer Y, Integer width, Integer height, List<String> format, String regex, Boolean splitRects, String folder) throws ApiException {
        ApiResponse<TextRectsResponse> resp = getTextWithHttpInfo(name, X, Y, width, height, format, regex, splitRects, folder);
        return resp.getData();
    }

    /**
     * Read document text.
     * 
     * @param name The document name. (required)
     * @param X  (required)
     * @param Y  (required)
     * @param width  (required)
     * @param height  (required)
     * @param format List of formats for search. (optional)
     * @param regex Formats are specified as a regular expression. (optional)
     * @param splitRects Split result fragments (default is true). (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;TextRectsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TextRectsResponse> getTextWithHttpInfo(String name, Integer X, Integer Y, Integer width, Integer height, List<String> format, String regex, Boolean splitRects, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getTextValidateBeforeCall(name, X, Y, width, height, format, regex, splitRects, folder, null, null);
        Type localVarReturnType = new TypeToken<TextRectsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document text. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param X  (required)
     * @param Y  (required)
     * @param width  (required)
     * @param height  (required)
     * @param format List of formats for search. (optional)
     * @param regex Formats are specified as a regular expression. (optional)
     * @param splitRects Split result fragments (default is true). (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTextAsync(String name, Integer X, Integer Y, Integer width, Integer height, List<String> format, String regex, Boolean splitRects, String folder, final ApiCallback<TextRectsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTextValidateBeforeCall(name, X, Y, width, height, format, regex, splitRects, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextRectsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTextItems
     * @param name  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getTextItemsCall(String name, String withEmpty, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/textItems"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (withEmpty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("withEmpty", withEmpty));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTextItemsValidateBeforeCall(String name, String withEmpty, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getTextItems(Async)");
        }
        

        com.squareup.okhttp.Call call = getTextItemsCall(name, withEmpty, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read document text items.
     * 
     * @param name  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return TextItemsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public TextItemsResponse getTextItems(String name, String withEmpty, String storage, String folder) throws ApiException {
        ApiResponse<TextItemsResponse> resp = getTextItemsWithHttpInfo(name, withEmpty, storage, folder);
        return resp.getData();
    }

    /**
     * Read document text items.
     * 
     * @param name  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;TextItemsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<TextItemsResponse> getTextItemsWithHttpInfo(String name, String withEmpty, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getTextItemsValidateBeforeCall(name, withEmpty, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<TextItemsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read document text items. (asynchronously)
     * 
     * @param name  (required)
     * @param withEmpty  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call getTextItemsAsync(String name, String withEmpty, String storage, String folder, final ApiCallback<TextItemsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTextItemsValidateBeforeCall(name, withEmpty, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextItemsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVerifySignature
     * @param name The document name. (required)
     * @param signName Sign name. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVerifySignatureCall(String name, String signName, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/verifySignature"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (signName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("signName", signName));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getVerifySignatureValidateBeforeCall(String name, String signName, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getVerifySignature(Async)");
        }
        
        // verify the required parameter 'signName' is set
        if (signName == null) {
            throw new ApiException("Missing the required parameter 'signName' when calling getVerifySignature(Async)");
        }
        

        com.squareup.okhttp.Call call = getVerifySignatureCall(name, signName, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify signature document.
     * 
     * @param name The document name. (required)
     * @param signName Sign name. (required)
     * @param folder The document folder. (optional)
     * @return SignatureVerifyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SignatureVerifyResponse getVerifySignature(String name, String signName, String folder) throws ApiException {
        ApiResponse<SignatureVerifyResponse> resp = getVerifySignatureWithHttpInfo(name, signName, folder);
        return resp.getData();
    }

    /**
     * Verify signature document.
     * 
     * @param name The document name. (required)
     * @param signName Sign name. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SignatureVerifyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SignatureVerifyResponse> getVerifySignatureWithHttpInfo(String name, String signName, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getVerifySignatureValidateBeforeCall(name, signName, folder, null, null);
        Type localVarReturnType = new TypeToken<SignatureVerifyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify signature document. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param signName Sign name. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVerifySignatureAsync(String name, String signName, String folder, final ApiCallback<SignatureVerifyResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getVerifySignatureValidateBeforeCall(name, signName, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SignatureVerifyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getWordsPerPage
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWordsPerPageCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/wordCount"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getWordsPerPageValidateBeforeCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getWordsPerPage(Async)");
        }
        

        com.squareup.okhttp.Call call = getWordsPerPageCall(name, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get number of words per document page.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return WordCountResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WordCountResponse getWordsPerPage(String name, String storage, String folder) throws ApiException {
        ApiResponse<WordCountResponse> resp = getWordsPerPageWithHttpInfo(name, storage, folder);
        return resp.getData();
    }

    /**
     * Get number of words per document page.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;WordCountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WordCountResponse> getWordsPerPageWithHttpInfo(String name, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getWordsPerPageValidateBeforeCall(name, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<WordCountResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get number of words per document page. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWordsPerPageAsync(String name, String storage, String folder, final ApiCallback<WordCountResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getWordsPerPageValidateBeforeCall(name, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WordCountResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getXfaPdfInStorageToAcroForm
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getXfaPdfInStorageToAcroFormCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/xfatoacroform"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getXfaPdfInStorageToAcroFormValidateBeforeCall(String name, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getXfaPdfInStorageToAcroForm(Async)");
        }
        

        com.squareup.okhttp.Call call = getXfaPdfInStorageToAcroFormCall(name, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and returns resulting file response content
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getXfaPdfInStorageToAcroForm(String name, String folder) throws ApiException {
        ApiResponse<File> resp = getXfaPdfInStorageToAcroFormWithHttpInfo(name, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and returns resulting file response content
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getXfaPdfInStorageToAcroFormWithHttpInfo(String name, String folder) throws ApiException {
        com.squareup.okhttp.Call call = getXfaPdfInStorageToAcroFormValidateBeforeCall(name, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and returns resulting file response content (asynchronously)
     * 
     * @param name The document name. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getXfaPdfInStorageToAcroFormAsync(String name, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getXfaPdfInStorageToAcroFormValidateBeforeCall(name, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postAppendDocument
     * @param name The original document name. (required)
     * @param appendDocument with the append document data. (optional)
     * @param appendFile Append file server path. (optional)
     * @param startPage Appending start page. (optional, default to 0)
     * @param endPage Appending end page. (optional, default to 0)
     * @param storage The documents storage. (optional)
     * @param folder The original document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAppendDocumentCall(String name, AppendDocument appendDocument, String appendFile, Integer startPage, Integer endPage, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = appendDocument;

        // create path and map variables
        String localVarPath = "/pdf/{name}/appendDocument"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (appendFile != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("appendFile", appendFile));
        if (startPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startPage", startPage));
        if (endPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endPage", endPage));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postAppendDocumentValidateBeforeCall(String name, AppendDocument appendDocument, String appendFile, Integer startPage, Integer endPage, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postAppendDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = postAppendDocumentCall(name, appendDocument, appendFile, startPage, endPage, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Append document to existing one.
     * 
     * @param name The original document name. (required)
     * @param appendDocument with the append document data. (optional)
     * @param appendFile Append file server path. (optional)
     * @param startPage Appending start page. (optional, default to 0)
     * @param endPage Appending end page. (optional, default to 0)
     * @param storage The documents storage. (optional)
     * @param folder The original document folder. (optional)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postAppendDocument(String name, AppendDocument appendDocument, String appendFile, Integer startPage, Integer endPage, String storage, String folder) throws ApiException {
        ApiResponse<DocumentResponse> resp = postAppendDocumentWithHttpInfo(name, appendDocument, appendFile, startPage, endPage, storage, folder);
        return resp.getData();
    }

    /**
     * Append document to existing one.
     * 
     * @param name The original document name. (required)
     * @param appendDocument with the append document data. (optional)
     * @param appendFile Append file server path. (optional)
     * @param startPage Appending start page. (optional, default to 0)
     * @param endPage Appending end page. (optional, default to 0)
     * @param storage The documents storage. (optional)
     * @param folder The original document folder. (optional)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> postAppendDocumentWithHttpInfo(String name, AppendDocument appendDocument, String appendFile, Integer startPage, Integer endPage, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postAppendDocumentValidateBeforeCall(name, appendDocument, appendFile, startPage, endPage, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Append document to existing one. (asynchronously)
     * 
     * @param name The original document name. (required)
     * @param appendDocument with the append document data. (optional)
     * @param appendFile Append file server path. (optional)
     * @param startPage Appending start page. (optional, default to 0)
     * @param endPage Appending end page. (optional, default to 0)
     * @param storage The documents storage. (optional)
     * @param folder The original document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAppendDocumentAsync(String name, AppendDocument appendDocument, String appendFile, Integer startPage, Integer endPage, String storage, String folder, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postAppendDocumentValidateBeforeCall(name, appendDocument, appendFile, startPage, endPage, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postCreateField
     * @param name The document name. (required)
     * @param page Document page number. (required)
     * @param field with the field data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postCreateFieldCall(String name, Integer page, Field field, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = field;

        // create path and map variables
        String localVarPath = "/pdf/{name}/fields"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postCreateFieldValidateBeforeCall(String name, Integer page, Field field, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postCreateField(Async)");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling postCreateField(Async)");
        }
        

        com.squareup.okhttp.Call call = postCreateFieldCall(name, page, field, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create field.
     * 
     * @param name The document name. (required)
     * @param page Document page number. (required)
     * @param field with the field data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse postCreateField(String name, Integer page, Field field, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = postCreateFieldWithHttpInfo(name, page, field, storage, folder);
        return resp.getData();
    }

    /**
     * Create field.
     * 
     * @param name The document name. (required)
     * @param page Document page number. (required)
     * @param field with the field data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> postCreateFieldWithHttpInfo(String name, Integer page, Field field, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postCreateFieldValidateBeforeCall(name, page, field, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create field. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param page Document page number. (required)
     * @param field with the field data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCreateFieldAsync(String name, Integer page, Field field, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postCreateFieldValidateBeforeCall(name, page, field, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDocumentReplaceText
     * @param name  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call postDocumentReplaceTextCall(String name, TextReplaceRequest textReplace, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = textReplace;

        // create path and map variables
        String localVarPath = "/pdf/{name}/replaceText"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDocumentReplaceTextValidateBeforeCall(String name, TextReplaceRequest textReplace, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postDocumentReplaceText(Async)");
        }
        
        // verify the required parameter 'textReplace' is set
        if (textReplace == null) {
            throw new ApiException("Missing the required parameter 'textReplace' when calling postDocumentReplaceText(Async)");
        }
        

        com.squareup.okhttp.Call call = postDocumentReplaceTextCall(name, textReplace, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Document&#39;s replace text method. Deprecated
     * 
     * @param name  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return DocumentTextReplaceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public DocumentTextReplaceResponse postDocumentReplaceText(String name, TextReplaceRequest textReplace, String storage, String folder) throws ApiException {
        ApiResponse<DocumentTextReplaceResponse> resp = postDocumentReplaceTextWithHttpInfo(name, textReplace, storage, folder);
        return resp.getData();
    }

    /**
     * Document&#39;s replace text method. Deprecated
     * 
     * @param name  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;DocumentTextReplaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<DocumentTextReplaceResponse> postDocumentReplaceTextWithHttpInfo(String name, TextReplaceRequest textReplace, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postDocumentReplaceTextValidateBeforeCall(name, textReplace, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<DocumentTextReplaceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Document&#39;s replace text method. Deprecated (asynchronously)
     * 
     * @param name  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call postDocumentReplaceTextAsync(String name, TextReplaceRequest textReplace, String storage, String folder, final ApiCallback<DocumentTextReplaceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postDocumentReplaceTextValidateBeforeCall(name, textReplace, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentTextReplaceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDocumentReplaceTextList
     * @param name  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call postDocumentReplaceTextListCall(String name, TextReplaceListRequest textReplaceListRequest, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = textReplaceListRequest;

        // create path and map variables
        String localVarPath = "/pdf/{name}/replaceTextList"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDocumentReplaceTextListValidateBeforeCall(String name, TextReplaceListRequest textReplaceListRequest, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postDocumentReplaceTextList(Async)");
        }
        
        // verify the required parameter 'textReplaceListRequest' is set
        if (textReplaceListRequest == null) {
            throw new ApiException("Missing the required parameter 'textReplaceListRequest' when calling postDocumentReplaceTextList(Async)");
        }
        

        com.squareup.okhttp.Call call = postDocumentReplaceTextListCall(name, textReplaceListRequest, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Document&#39;s replace text method. Deprecated
     * 
     * @param name  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return DocumentTextReplaceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public DocumentTextReplaceResponse postDocumentReplaceTextList(String name, TextReplaceListRequest textReplaceListRequest, String storage, String folder) throws ApiException {
        ApiResponse<DocumentTextReplaceResponse> resp = postDocumentReplaceTextListWithHttpInfo(name, textReplaceListRequest, storage, folder);
        return resp.getData();
    }

    /**
     * Document&#39;s replace text method. Deprecated
     * 
     * @param name  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;DocumentTextReplaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<DocumentTextReplaceResponse> postDocumentReplaceTextListWithHttpInfo(String name, TextReplaceListRequest textReplaceListRequest, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postDocumentReplaceTextListValidateBeforeCall(name, textReplaceListRequest, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<DocumentTextReplaceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Document&#39;s replace text method. Deprecated (asynchronously)
     * 
     * @param name  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call postDocumentReplaceTextListAsync(String name, TextReplaceListRequest textReplaceListRequest, String storage, String folder, final ApiCallback<DocumentTextReplaceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postDocumentReplaceTextListValidateBeforeCall(name, textReplaceListRequest, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentTextReplaceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDocumentTextReplace
     * @param name  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postDocumentTextReplaceCall(String name, TextReplaceListRequest textReplace, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = textReplace;

        // create path and map variables
        String localVarPath = "/pdf/{name}/text/replace"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDocumentTextReplaceValidateBeforeCall(String name, TextReplaceListRequest textReplace, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postDocumentTextReplace(Async)");
        }
        
        // verify the required parameter 'textReplace' is set
        if (textReplace == null) {
            throw new ApiException("Missing the required parameter 'textReplace' when calling postDocumentTextReplace(Async)");
        }
        

        com.squareup.okhttp.Call call = postDocumentTextReplaceCall(name, textReplace, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Document&#39;s replace text method.
     * 
     * @param name  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return TextReplaceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TextReplaceResponse postDocumentTextReplace(String name, TextReplaceListRequest textReplace, String storage, String folder) throws ApiException {
        ApiResponse<TextReplaceResponse> resp = postDocumentTextReplaceWithHttpInfo(name, textReplace, storage, folder);
        return resp.getData();
    }

    /**
     * Document&#39;s replace text method.
     * 
     * @param name  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;TextReplaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TextReplaceResponse> postDocumentTextReplaceWithHttpInfo(String name, TextReplaceListRequest textReplace, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postDocumentTextReplaceValidateBeforeCall(name, textReplace, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<TextReplaceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Document&#39;s replace text method. (asynchronously)
     * 
     * @param name  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDocumentTextReplaceAsync(String name, TextReplaceListRequest textReplace, String storage, String folder, final ApiCallback<TextReplaceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postDocumentTextReplaceValidateBeforeCall(name, textReplace, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextReplaceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postMovePage
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param newIndex The new page position/index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postMovePageCall(String name, Integer pageNumber, Integer newIndex, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/movePage"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (newIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("newIndex", newIndex));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postMovePageValidateBeforeCall(String name, Integer pageNumber, Integer newIndex, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postMovePage(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling postMovePage(Async)");
        }
        
        // verify the required parameter 'newIndex' is set
        if (newIndex == null) {
            throw new ApiException("Missing the required parameter 'newIndex' when calling postMovePage(Async)");
        }
        

        com.squareup.okhttp.Call call = postMovePageCall(name, pageNumber, newIndex, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Move page to new position.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param newIndex The new page position/index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse postMovePage(String name, Integer pageNumber, Integer newIndex, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = postMovePageWithHttpInfo(name, pageNumber, newIndex, storage, folder);
        return resp.getData();
    }

    /**
     * Move page to new position.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param newIndex The new page position/index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> postMovePageWithHttpInfo(String name, Integer pageNumber, Integer newIndex, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postMovePageValidateBeforeCall(name, pageNumber, newIndex, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Move page to new position. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param newIndex The new page position/index. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postMovePageAsync(String name, Integer pageNumber, Integer newIndex, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postMovePageValidateBeforeCall(name, pageNumber, newIndex, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postOptimizeDocument
     * @param name The document name. (required)
     * @param options The optimization options. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postOptimizeDocumentCall(String name, OptimizeOptions options, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = options;

        // create path and map variables
        String localVarPath = "/pdf/{name}/optimize"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postOptimizeDocumentValidateBeforeCall(String name, OptimizeOptions options, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postOptimizeDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = postOptimizeDocumentCall(name, options, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Optimize document.
     * 
     * @param name The document name. (required)
     * @param options The optimization options. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse postOptimizeDocument(String name, OptimizeOptions options, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = postOptimizeDocumentWithHttpInfo(name, options, storage, folder);
        return resp.getData();
    }

    /**
     * Optimize document.
     * 
     * @param name The document name. (required)
     * @param options The optimization options. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> postOptimizeDocumentWithHttpInfo(String name, OptimizeOptions options, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postOptimizeDocumentValidateBeforeCall(name, options, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Optimize document. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param options The optimization options. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postOptimizeDocumentAsync(String name, OptimizeOptions options, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postOptimizeDocumentValidateBeforeCall(name, options, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postPageReplaceText
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call postPageReplaceTextCall(String name, Integer pageNumber, TextReplaceRequest textReplace, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = textReplace;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/replaceText"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postPageReplaceTextValidateBeforeCall(String name, Integer pageNumber, TextReplaceRequest textReplace, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postPageReplaceText(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling postPageReplaceText(Async)");
        }
        
        // verify the required parameter 'textReplace' is set
        if (textReplace == null) {
            throw new ApiException("Missing the required parameter 'textReplace' when calling postPageReplaceText(Async)");
        }
        

        com.squareup.okhttp.Call call = postPageReplaceTextCall(name, pageNumber, textReplace, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Page&#39;s replace text method. Deprecated
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return PageTextReplaceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public PageTextReplaceResponse postPageReplaceText(String name, Integer pageNumber, TextReplaceRequest textReplace, String storage, String folder) throws ApiException {
        ApiResponse<PageTextReplaceResponse> resp = postPageReplaceTextWithHttpInfo(name, pageNumber, textReplace, storage, folder);
        return resp.getData();
    }

    /**
     * Page&#39;s replace text method. Deprecated
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;PageTextReplaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<PageTextReplaceResponse> postPageReplaceTextWithHttpInfo(String name, Integer pageNumber, TextReplaceRequest textReplace, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postPageReplaceTextValidateBeforeCall(name, pageNumber, textReplace, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<PageTextReplaceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Page&#39;s replace text method. Deprecated (asynchronously)
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplace  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call postPageReplaceTextAsync(String name, Integer pageNumber, TextReplaceRequest textReplace, String storage, String folder, final ApiCallback<PageTextReplaceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postPageReplaceTextValidateBeforeCall(name, pageNumber, textReplace, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageTextReplaceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postPageReplaceTextList
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call postPageReplaceTextListCall(String name, Integer pageNumber, TextReplaceListRequest textReplaceListRequest, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = textReplaceListRequest;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/replaceTextList"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postPageReplaceTextListValidateBeforeCall(String name, Integer pageNumber, TextReplaceListRequest textReplaceListRequest, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postPageReplaceTextList(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling postPageReplaceTextList(Async)");
        }
        
        // verify the required parameter 'textReplaceListRequest' is set
        if (textReplaceListRequest == null) {
            throw new ApiException("Missing the required parameter 'textReplaceListRequest' when calling postPageReplaceTextList(Async)");
        }
        

        com.squareup.okhttp.Call call = postPageReplaceTextListCall(name, pageNumber, textReplaceListRequest, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Page&#39;s replace text method. Deprecated
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return PageTextReplaceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public PageTextReplaceResponse postPageReplaceTextList(String name, Integer pageNumber, TextReplaceListRequest textReplaceListRequest, String storage, String folder) throws ApiException {
        ApiResponse<PageTextReplaceResponse> resp = postPageReplaceTextListWithHttpInfo(name, pageNumber, textReplaceListRequest, storage, folder);
        return resp.getData();
    }

    /**
     * Page&#39;s replace text method. Deprecated
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;PageTextReplaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<PageTextReplaceResponse> postPageReplaceTextListWithHttpInfo(String name, Integer pageNumber, TextReplaceListRequest textReplaceListRequest, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postPageReplaceTextListValidateBeforeCall(name, pageNumber, textReplaceListRequest, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<PageTextReplaceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Page&#39;s replace text method. Deprecated (asynchronously)
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call postPageReplaceTextListAsync(String name, Integer pageNumber, TextReplaceListRequest textReplaceListRequest, String storage, String folder, final ApiCallback<PageTextReplaceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postPageReplaceTextListValidateBeforeCall(name, pageNumber, textReplaceListRequest, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageTextReplaceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postPageTextReplace
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPageTextReplaceCall(String name, Integer pageNumber, TextReplaceListRequest textReplaceListRequest, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = textReplaceListRequest;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/text/replace"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postPageTextReplaceValidateBeforeCall(String name, Integer pageNumber, TextReplaceListRequest textReplaceListRequest, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postPageTextReplace(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling postPageTextReplace(Async)");
        }
        
        // verify the required parameter 'textReplaceListRequest' is set
        if (textReplaceListRequest == null) {
            throw new ApiException("Missing the required parameter 'textReplaceListRequest' when calling postPageTextReplace(Async)");
        }
        

        com.squareup.okhttp.Call call = postPageTextReplaceCall(name, pageNumber, textReplaceListRequest, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Page&#39;s replace text method.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return TextReplaceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TextReplaceResponse postPageTextReplace(String name, Integer pageNumber, TextReplaceListRequest textReplaceListRequest, String storage, String folder) throws ApiException {
        ApiResponse<TextReplaceResponse> resp = postPageTextReplaceWithHttpInfo(name, pageNumber, textReplaceListRequest, storage, folder);
        return resp.getData();
    }

    /**
     * Page&#39;s replace text method.
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;TextReplaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TextReplaceResponse> postPageTextReplaceWithHttpInfo(String name, Integer pageNumber, TextReplaceListRequest textReplaceListRequest, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postPageTextReplaceValidateBeforeCall(name, pageNumber, textReplaceListRequest, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<TextReplaceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Page&#39;s replace text method. (asynchronously)
     * 
     * @param name  (required)
     * @param pageNumber  (required)
     * @param textReplaceListRequest  (required)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPageTextReplaceAsync(String name, Integer pageNumber, TextReplaceListRequest textReplaceListRequest, String storage, String folder, final ApiCallback<TextReplaceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postPageTextReplaceValidateBeforeCall(name, pageNumber, textReplaceListRequest, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextReplaceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postReplaceImage
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param imageNumber The image number. (required)
     * @param imageFile Path to image file if specified. Request content is used otherwise. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param image Image file. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postReplaceImageCall(String name, Integer pageNumber, Integer imageNumber, String imageFile, String storage, String folder, File image, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = image;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/images/{imageNumber}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()))
            .replaceAll("\\{" + "imageNumber" + "\\}", apiClient.escapeString(imageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (imageFile != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("imageFile", imageFile));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postReplaceImageValidateBeforeCall(String name, Integer pageNumber, Integer imageNumber, String imageFile, String storage, String folder, File image, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postReplaceImage(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling postReplaceImage(Async)");
        }
        
        // verify the required parameter 'imageNumber' is set
        if (imageNumber == null) {
            throw new ApiException("Missing the required parameter 'imageNumber' when calling postReplaceImage(Async)");
        }
        

        com.squareup.okhttp.Call call = postReplaceImageCall(name, pageNumber, imageNumber, imageFile, storage, folder, image, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Replace document image.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param imageNumber The image number. (required)
     * @param imageFile Path to image file if specified. Request content is used otherwise. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param image Image file. (optional)
     * @return ImageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImageResponse postReplaceImage(String name, Integer pageNumber, Integer imageNumber, String imageFile, String storage, String folder, File image) throws ApiException {
        ApiResponse<ImageResponse> resp = postReplaceImageWithHttpInfo(name, pageNumber, imageNumber, imageFile, storage, folder, image);
        return resp.getData();
    }

    /**
     * Replace document image.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param imageNumber The image number. (required)
     * @param imageFile Path to image file if specified. Request content is used otherwise. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param image Image file. (optional)
     * @return ApiResponse&lt;ImageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImageResponse> postReplaceImageWithHttpInfo(String name, Integer pageNumber, Integer imageNumber, String imageFile, String storage, String folder, File image) throws ApiException {
        com.squareup.okhttp.Call call = postReplaceImageValidateBeforeCall(name, pageNumber, imageNumber, imageFile, storage, folder, image, null, null);
        Type localVarReturnType = new TypeToken<ImageResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replace document image. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param imageNumber The image number. (required)
     * @param imageFile Path to image file if specified. Request content is used otherwise. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param image Image file. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postReplaceImageAsync(String name, Integer pageNumber, Integer imageNumber, String imageFile, String storage, String folder, File image, final ApiCallback<ImageResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postReplaceImageValidateBeforeCall(name, pageNumber, imageNumber, imageFile, storage, folder, image, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImageResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSignDocument
     * @param name The document name. (required)
     * @param signature Signature object containing signature data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSignDocumentCall(String name, Signature signature, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = signature;

        // create path and map variables
        String localVarPath = "/pdf/{name}/sign"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSignDocumentValidateBeforeCall(String name, Signature signature, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSignDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = postSignDocumentCall(name, signature, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Sign document.
     * 
     * @param name The document name. (required)
     * @param signature Signature object containing signature data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse postSignDocument(String name, Signature signature, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = postSignDocumentWithHttpInfo(name, signature, storage, folder);
        return resp.getData();
    }

    /**
     * Sign document.
     * 
     * @param name The document name. (required)
     * @param signature Signature object containing signature data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> postSignDocumentWithHttpInfo(String name, Signature signature, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postSignDocumentValidateBeforeCall(name, signature, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Sign document. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param signature Signature object containing signature data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSignDocumentAsync(String name, Signature signature, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSignDocumentValidateBeforeCall(name, signature, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSignPage
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param signature Signature object containing signature data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSignPageCall(String name, Integer pageNumber, Signature signature, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = signature;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/sign"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSignPageValidateBeforeCall(String name, Integer pageNumber, Signature signature, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSignPage(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling postSignPage(Async)");
        }
        

        com.squareup.okhttp.Call call = postSignPageCall(name, pageNumber, signature, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Sign page.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param signature Signature object containing signature data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse postSignPage(String name, Integer pageNumber, Signature signature, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = postSignPageWithHttpInfo(name, pageNumber, signature, storage, folder);
        return resp.getData();
    }

    /**
     * Sign page.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param signature Signature object containing signature data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> postSignPageWithHttpInfo(String name, Integer pageNumber, Signature signature, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postSignPageValidateBeforeCall(name, pageNumber, signature, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Sign page. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param signature Signature object containing signature data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSignPageAsync(String name, Integer pageNumber, Signature signature, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSignPageValidateBeforeCall(name, pageNumber, signature, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postSplitDocument
     * @param name Document name. (required)
     * @param format Resulting documents format. (optional)
     * @param from Start page if defined. (optional)
     * @param to End page if defined. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSplitDocumentCall(String name, String format, Integer from, Integer to, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/split"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
        if (to != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to", to));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSplitDocumentValidateBeforeCall(String name, String format, Integer from, Integer to, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSplitDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = postSplitDocumentCall(name, format, from, to, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Split document to parts.
     * 
     * @param name Document name. (required)
     * @param format Resulting documents format. (optional)
     * @param from Start page if defined. (optional)
     * @param to End page if defined. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return SplitResultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SplitResultResponse postSplitDocument(String name, String format, Integer from, Integer to, String storage, String folder) throws ApiException {
        ApiResponse<SplitResultResponse> resp = postSplitDocumentWithHttpInfo(name, format, from, to, storage, folder);
        return resp.getData();
    }

    /**
     * Split document to parts.
     * 
     * @param name Document name. (required)
     * @param format Resulting documents format. (optional)
     * @param from Start page if defined. (optional)
     * @param to End page if defined. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SplitResultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SplitResultResponse> postSplitDocumentWithHttpInfo(String name, String format, Integer from, Integer to, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = postSplitDocumentValidateBeforeCall(name, format, from, to, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SplitResultResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Split document to parts. (asynchronously)
     * 
     * @param name Document name. (required)
     * @param format Resulting documents format. (optional)
     * @param from Start page if defined. (optional)
     * @param to End page if defined. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSplitDocumentAsync(String name, String format, Integer from, Integer to, String storage, String folder, final ApiCallback<SplitResultResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSplitDocumentValidateBeforeCall(name, format, from, to, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SplitResultResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putAddNewPage
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putAddNewPageCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putAddNewPageValidateBeforeCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putAddNewPage(Async)");
        }
        

        com.squareup.okhttp.Call call = putAddNewPageCall(name, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add new page to end of the document.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return DocumentPagesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPagesResponse putAddNewPage(String name, String storage, String folder) throws ApiException {
        ApiResponse<DocumentPagesResponse> resp = putAddNewPageWithHttpInfo(name, storage, folder);
        return resp.getData();
    }

    /**
     * Add new page to end of the document.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;DocumentPagesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentPagesResponse> putAddNewPageWithHttpInfo(String name, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putAddNewPageValidateBeforeCall(name, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<DocumentPagesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add new page to end of the document. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putAddNewPageAsync(String name, String storage, String folder, final ApiCallback<DocumentPagesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putAddNewPageValidateBeforeCall(name, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentPagesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putAddParagraph
     * @param name Name of the document to which text should be added. (required)
     * @param pageNumber Number of page (starting with 1) to which text should be added. (required)
     * @param paragraph Paragraph data. (optional)
     * @param storage File storage to be used. (optional)
     * @param folder Document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call putAddParagraphCall(String name, Integer pageNumber, Paragraph paragraph, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = paragraph;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/paragraph"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putAddParagraphValidateBeforeCall(String name, Integer pageNumber, Paragraph paragraph, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putAddParagraph(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling putAddParagraph(Async)");
        }
        

        com.squareup.okhttp.Call call = putAddParagraphCall(name, pageNumber, paragraph, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add text to PDF document page. Deprecated
     * 
     * @param name Name of the document to which text should be added. (required)
     * @param pageNumber Number of page (starting with 1) to which text should be added. (required)
     * @param paragraph Paragraph data. (optional)
     * @param storage File storage to be used. (optional)
     * @param folder Document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public SaaSposeResponse putAddParagraph(String name, Integer pageNumber, Paragraph paragraph, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = putAddParagraphWithHttpInfo(name, pageNumber, paragraph, storage, folder);
        return resp.getData();
    }

    /**
     * Add text to PDF document page. Deprecated
     * 
     * @param name Name of the document to which text should be added. (required)
     * @param pageNumber Number of page (starting with 1) to which text should be added. (required)
     * @param paragraph Paragraph data. (optional)
     * @param storage File storage to be used. (optional)
     * @param folder Document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<SaaSposeResponse> putAddParagraphWithHttpInfo(String name, Integer pageNumber, Paragraph paragraph, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putAddParagraphValidateBeforeCall(name, pageNumber, paragraph, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add text to PDF document page. Deprecated (asynchronously)
     * 
     * @param name Name of the document to which text should be added. (required)
     * @param pageNumber Number of page (starting with 1) to which text should be added. (required)
     * @param paragraph Paragraph data. (optional)
     * @param storage File storage to be used. (optional)
     * @param folder Document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call putAddParagraphAsync(String name, Integer pageNumber, Paragraph paragraph, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putAddParagraphValidateBeforeCall(name, pageNumber, paragraph, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putAddText
     * @param name The document name. (required)
     * @param pageNumber Number of page (starting from 1). (required)
     * @param paragraph Paragraph data. (optional)
     * @param folder Document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putAddTextCall(String name, Integer pageNumber, Paragraph paragraph, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = paragraph;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/text"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putAddTextValidateBeforeCall(String name, Integer pageNumber, Paragraph paragraph, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putAddText(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling putAddText(Async)");
        }
        

        com.squareup.okhttp.Call call = putAddTextCall(name, pageNumber, paragraph, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add text to PDF document page.
     * 
     * @param name The document name. (required)
     * @param pageNumber Number of page (starting from 1). (required)
     * @param paragraph Paragraph data. (optional)
     * @param folder Document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse putAddText(String name, Integer pageNumber, Paragraph paragraph, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = putAddTextWithHttpInfo(name, pageNumber, paragraph, folder);
        return resp.getData();
    }

    /**
     * Add text to PDF document page.
     * 
     * @param name The document name. (required)
     * @param pageNumber Number of page (starting from 1). (required)
     * @param paragraph Paragraph data. (optional)
     * @param folder Document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> putAddTextWithHttpInfo(String name, Integer pageNumber, Paragraph paragraph, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putAddTextValidateBeforeCall(name, pageNumber, paragraph, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add text to PDF document page. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber Number of page (starting from 1). (required)
     * @param paragraph Paragraph data. (optional)
     * @param folder Document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putAddTextAsync(String name, Integer pageNumber, Paragraph paragraph, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putAddTextValidateBeforeCall(name, pageNumber, paragraph, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putConvertDocument
     * @param format The format to convert. (optional)
     * @param url  (optional)
     * @param outPath Path to save result (optional)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call putConvertDocumentCall(String format, String url, String outPath, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (url != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("url", url));
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putConvertDocumentValidateBeforeCall(String format, String url, String outPath, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = putConvertDocumentCall(format, url, outPath, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Convert document from request content to format specified.
     * 
     * @param format The format to convert. (optional)
     * @param url  (optional)
     * @param outPath Path to save result (optional)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public File putConvertDocument(String format, String url, String outPath, File file) throws ApiException {
        ApiResponse<File> resp = putConvertDocumentWithHttpInfo(format, url, outPath, file);
        return resp.getData();
    }

    /**
     * Convert document from request content to format specified.
     * 
     * @param format The format to convert. (optional)
     * @param url  (optional)
     * @param outPath Path to save result (optional)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<File> putConvertDocumentWithHttpInfo(String format, String url, String outPath, File file) throws ApiException {
        com.squareup.okhttp.Call call = putConvertDocumentValidateBeforeCall(format, url, outPath, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Convert document from request content to format specified. (asynchronously)
     * 
     * @param format The format to convert. (optional)
     * @param url  (optional)
     * @param outPath Path to save result (optional)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call putConvertDocumentAsync(String format, String url, String outPath, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putConvertDocumentValidateBeforeCall(format, url, outPath, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putCreate
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putCreateCall(String path, File file, String versionId, String storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/storage/file";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("path", path));
        if (versionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("versionId", versionId));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putCreateValidateBeforeCall(String path, File file, String versionId, String storage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling putCreate(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling putCreate(Async)");
        }
        

        com.squareup.okhttp.Call call = putCreateCall(path, file, versionId, storage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upload a specific file 
     * 
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse putCreate(String path, File file, String versionId, String storage) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = putCreateWithHttpInfo(path, file, versionId, storage);
        return resp.getData();
    }

    /**
     * Upload a specific file 
     * 
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> putCreateWithHttpInfo(String path, File file, String versionId, String storage) throws ApiException {
        com.squareup.okhttp.Call call = putCreateValidateBeforeCall(path, file, versionId, storage, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload a specific file  (asynchronously)
     * 
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext (required)
     * @param file File to upload (required)
     * @param versionId Source file&#39;s version (optional)
     * @param storage User&#39;s storage name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCreateAsync(String path, File file, String versionId, String storage, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putCreateValidateBeforeCall(path, file, versionId, storage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putCreateDocument
     * @param name The new document name. (required)
     * @param templateFile The template file server path if defined. (optional)
     * @param dataFile The data file path (for xml template only). (optional)
     * @param templateType The template type, can be xml, html, bmp, jpg, png, tiff, emf, cgm, tex. (optional)
     * @param storage The document storage. (optional)
     * @param folder The new document folder. (optional)
     * @param url The url of web page if defined. (optional)
     * @param fitSize Draw a margin around content in resulting pdf. (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putCreateDocumentCall(String name, String templateFile, String dataFile, String templateType, String storage, String folder, String url, Boolean fitSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (templateFile != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("templateFile", templateFile));
        if (dataFile != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dataFile", dataFile));
        if (templateType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("templateType", templateType));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));
        if (url != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("url", url));
        if (fitSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fitSize", fitSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putCreateDocumentValidateBeforeCall(String name, String templateFile, String dataFile, String templateType, String storage, String folder, String url, Boolean fitSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putCreateDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = putCreateDocumentCall(name, templateFile, dataFile, templateType, storage, folder, url, fitSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create new document.
     * 
     * @param name The new document name. (required)
     * @param templateFile The template file server path if defined. (optional)
     * @param dataFile The data file path (for xml template only). (optional)
     * @param templateType The template type, can be xml, html, bmp, jpg, png, tiff, emf, cgm, tex. (optional)
     * @param storage The document storage. (optional)
     * @param folder The new document folder. (optional)
     * @param url The url of web page if defined. (optional)
     * @param fitSize Draw a margin around content in resulting pdf. (optional, default to false)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse putCreateDocument(String name, String templateFile, String dataFile, String templateType, String storage, String folder, String url, Boolean fitSize) throws ApiException {
        ApiResponse<DocumentResponse> resp = putCreateDocumentWithHttpInfo(name, templateFile, dataFile, templateType, storage, folder, url, fitSize);
        return resp.getData();
    }

    /**
     * Create new document.
     * 
     * @param name The new document name. (required)
     * @param templateFile The template file server path if defined. (optional)
     * @param dataFile The data file path (for xml template only). (optional)
     * @param templateType The template type, can be xml, html, bmp, jpg, png, tiff, emf, cgm, tex. (optional)
     * @param storage The document storage. (optional)
     * @param folder The new document folder. (optional)
     * @param url The url of web page if defined. (optional)
     * @param fitSize Draw a margin around content in resulting pdf. (optional, default to false)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> putCreateDocumentWithHttpInfo(String name, String templateFile, String dataFile, String templateType, String storage, String folder, String url, Boolean fitSize) throws ApiException {
        com.squareup.okhttp.Call call = putCreateDocumentValidateBeforeCall(name, templateFile, dataFile, templateType, storage, folder, url, fitSize, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new document. (asynchronously)
     * 
     * @param name The new document name. (required)
     * @param templateFile The template file server path if defined. (optional)
     * @param dataFile The data file path (for xml template only). (optional)
     * @param templateType The template type, can be xml, html, bmp, jpg, png, tiff, emf, cgm, tex. (optional)
     * @param storage The document storage. (optional)
     * @param folder The new document folder. (optional)
     * @param url The url of web page if defined. (optional)
     * @param fitSize Draw a margin around content in resulting pdf. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCreateDocumentAsync(String name, String templateFile, String dataFile, String templateType, String storage, String folder, String url, Boolean fitSize, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putCreateDocumentValidateBeforeCall(name, templateFile, dataFile, templateType, storage, folder, url, fitSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putCreateDocumentFromImages
     * @param name The new document name. (required)
     * @param images The images file paths set.   (optional)
     * @param ocr To create OCR layer for image or not. (optional, default to false)
     * @param ocrLang The language which is defined for OCR engine. Default is eng. (optional, default to eng)
     * @param storage The document storage. (optional)
     * @param folder The new document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putCreateDocumentFromImagesCall(String name, ImagesListRequest images, Boolean ocr, String ocrLang, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = images;

        // create path and map variables
        String localVarPath = "/pdf/{name}/fromimages"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ocr != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ocr", ocr));
        if (ocrLang != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ocrLang", ocrLang));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putCreateDocumentFromImagesValidateBeforeCall(String name, ImagesListRequest images, Boolean ocr, String ocrLang, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putCreateDocumentFromImages(Async)");
        }
        

        com.squareup.okhttp.Call call = putCreateDocumentFromImagesCall(name, images, ocr, ocrLang, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create new document from images.
     * 
     * @param name The new document name. (required)
     * @param images The images file paths set.   (optional)
     * @param ocr To create OCR layer for image or not. (optional, default to false)
     * @param ocrLang The language which is defined for OCR engine. Default is eng. (optional, default to eng)
     * @param storage The document storage. (optional)
     * @param folder The new document folder. (optional)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse putCreateDocumentFromImages(String name, ImagesListRequest images, Boolean ocr, String ocrLang, String storage, String folder) throws ApiException {
        ApiResponse<DocumentResponse> resp = putCreateDocumentFromImagesWithHttpInfo(name, images, ocr, ocrLang, storage, folder);
        return resp.getData();
    }

    /**
     * Create new document from images.
     * 
     * @param name The new document name. (required)
     * @param images The images file paths set.   (optional)
     * @param ocr To create OCR layer for image or not. (optional, default to false)
     * @param ocrLang The language which is defined for OCR engine. Default is eng. (optional, default to eng)
     * @param storage The document storage. (optional)
     * @param folder The new document folder. (optional)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> putCreateDocumentFromImagesWithHttpInfo(String name, ImagesListRequest images, Boolean ocr, String ocrLang, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putCreateDocumentFromImagesValidateBeforeCall(name, images, ocr, ocrLang, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new document from images. (asynchronously)
     * 
     * @param name The new document name. (required)
     * @param images The images file paths set.   (optional)
     * @param ocr To create OCR layer for image or not. (optional, default to false)
     * @param ocrLang The language which is defined for OCR engine. Default is eng. (optional, default to eng)
     * @param storage The document storage. (optional)
     * @param folder The new document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCreateDocumentFromImagesAsync(String name, ImagesListRequest images, Boolean ocr, String ocrLang, String storage, String folder, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putCreateDocumentFromImagesValidateBeforeCall(name, images, ocr, ocrLang, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putDocumentSaveAsTiff
     * @param name The document name. (required)
     * @param exportOptions with tiff export options. (optional)
     * @param resultFile The resulting file. (optional)
     * @param brightness The image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call putDocumentSaveAsTiffCall(String name, TiffExportOptions exportOptions, String resultFile, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = exportOptions;

        // create path and map variables
        String localVarPath = "/pdf/{name}/SaveAs/tiff"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (resultFile != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resultFile", resultFile));
        if (brightness != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("brightness", brightness));
        if (compression != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("compression", compression));
        if (colorDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("colorDepth", colorDepth));
        if (leftMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("leftMargin", leftMargin));
        if (rightMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("rightMargin", rightMargin));
        if (topMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("topMargin", topMargin));
        if (bottomMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("bottomMargin", bottomMargin));
        if (orientation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orientation", orientation));
        if (skipBlankPages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skipBlankPages", skipBlankPages));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("height", height));
        if (xResolution != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("xResolution", xResolution));
        if (yResolution != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("yResolution", yResolution));
        if (pageIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageIndex", pageIndex));
        if (pageCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageCount", pageCount));
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDocumentSaveAsTiffValidateBeforeCall(String name, TiffExportOptions exportOptions, String resultFile, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putDocumentSaveAsTiff(Async)");
        }
        

        com.squareup.okhttp.Call call = putDocumentSaveAsTiffCall(name, exportOptions, resultFile, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Save document as Tiff image.
     * 
     * @param name The document name. (required)
     * @param exportOptions with tiff export options. (optional)
     * @param resultFile The resulting file. (optional)
     * @param brightness The image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public SaaSposeResponse putDocumentSaveAsTiff(String name, TiffExportOptions exportOptions, String resultFile, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = putDocumentSaveAsTiffWithHttpInfo(name, exportOptions, resultFile, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, storage, folder);
        return resp.getData();
    }

    /**
     * Save document as Tiff image.
     * 
     * @param name The document name. (required)
     * @param exportOptions with tiff export options. (optional)
     * @param resultFile The resulting file. (optional)
     * @param brightness The image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<SaaSposeResponse> putDocumentSaveAsTiffWithHttpInfo(String name, TiffExportOptions exportOptions, String resultFile, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putDocumentSaveAsTiffValidateBeforeCall(name, exportOptions, resultFile, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Save document as Tiff image. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param exportOptions with tiff export options. (optional)
     * @param resultFile The resulting file. (optional)
     * @param brightness The image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call putDocumentSaveAsTiffAsync(String name, TiffExportOptions exportOptions, String resultFile, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putDocumentSaveAsTiffValidateBeforeCall(name, exportOptions, resultFile, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putFieldsFlatten
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putFieldsFlattenCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/fields/flatten"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putFieldsFlattenValidateBeforeCall(String name, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putFieldsFlatten(Async)");
        }
        

        com.squareup.okhttp.Call call = putFieldsFlattenCall(name, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Flatten form fields in document.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse putFieldsFlatten(String name, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = putFieldsFlattenWithHttpInfo(name, storage, folder);
        return resp.getData();
    }

    /**
     * Flatten form fields in document.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> putFieldsFlattenWithHttpInfo(String name, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putFieldsFlattenValidateBeforeCall(name, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Flatten form fields in document. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putFieldsFlattenAsync(String name, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putFieldsFlattenValidateBeforeCall(name, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putMergeDocuments
     * @param name Resulting documen name. (required)
     * @param mergeDocuments with a list of documents. (optional)
     * @param storage Resulting document storage. (optional)
     * @param folder Resulting document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putMergeDocumentsCall(String name, MergeDocuments mergeDocuments, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = mergeDocuments;

        // create path and map variables
        String localVarPath = "/pdf/{name}/merge"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putMergeDocumentsValidateBeforeCall(String name, MergeDocuments mergeDocuments, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putMergeDocuments(Async)");
        }
        

        com.squareup.okhttp.Call call = putMergeDocumentsCall(name, mergeDocuments, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Merge a list of documents.
     * 
     * @param name Resulting documen name. (required)
     * @param mergeDocuments with a list of documents. (optional)
     * @param storage Resulting document storage. (optional)
     * @param folder Resulting document folder. (optional)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse putMergeDocuments(String name, MergeDocuments mergeDocuments, String storage, String folder) throws ApiException {
        ApiResponse<DocumentResponse> resp = putMergeDocumentsWithHttpInfo(name, mergeDocuments, storage, folder);
        return resp.getData();
    }

    /**
     * Merge a list of documents.
     * 
     * @param name Resulting documen name. (required)
     * @param mergeDocuments with a list of documents. (optional)
     * @param storage Resulting document storage. (optional)
     * @param folder Resulting document folder. (optional)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> putMergeDocumentsWithHttpInfo(String name, MergeDocuments mergeDocuments, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putMergeDocumentsValidateBeforeCall(name, mergeDocuments, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Merge a list of documents. (asynchronously)
     * 
     * @param name Resulting documen name. (required)
     * @param mergeDocuments with a list of documents. (optional)
     * @param storage Resulting document storage. (optional)
     * @param folder Resulting document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putMergeDocumentsAsync(String name, MergeDocuments mergeDocuments, String storage, String folder, final ApiCallback<DocumentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putMergeDocumentsValidateBeforeCall(name, mergeDocuments, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPageAddStamp
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param stamp with data. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPageAddStampCall(String name, Integer pageNumber, Stamp stamp, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = stamp;

        // create path and map variables
        String localVarPath = "/pdf/{name}/pages/{pageNumber}/stamp"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPageAddStampValidateBeforeCall(String name, Integer pageNumber, Stamp stamp, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPageAddStamp(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling putPageAddStamp(Async)");
        }
        
        // verify the required parameter 'stamp' is set
        if (stamp == null) {
            throw new ApiException("Missing the required parameter 'stamp' when calling putPageAddStamp(Async)");
        }
        

        com.squareup.okhttp.Call call = putPageAddStampCall(name, pageNumber, stamp, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add page stamp.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param stamp with data. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse putPageAddStamp(String name, Integer pageNumber, Stamp stamp, String storage, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = putPageAddStampWithHttpInfo(name, pageNumber, stamp, storage, folder);
        return resp.getData();
    }

    /**
     * Add page stamp.
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param stamp with data. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> putPageAddStampWithHttpInfo(String name, Integer pageNumber, Stamp stamp, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPageAddStampValidateBeforeCall(name, pageNumber, stamp, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add page stamp. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param pageNumber The page number. (required)
     * @param stamp with data. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPageAddStampAsync(String name, Integer pageNumber, Stamp stamp, String storage, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPageAddStampValidateBeforeCall(name, pageNumber, stamp, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToDoc
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.doc) (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToDocCall(String outPath, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/doc";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (addReturnToLineEnd != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("addReturnToLineEnd", addReturnToLineEnd));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (imageResolutionX != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("imageResolutionX", imageResolutionX));
        if (imageResolutionY != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("imageResolutionY", imageResolutionY));
        if (maxDistanceBetweenTextLines != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxDistanceBetweenTextLines", maxDistanceBetweenTextLines));
        if (mode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mode", mode));
        if (recognizeBullets != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("recognizeBullets", recognizeBullets));
        if (relativeHorizontalProximity != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("relativeHorizontalProximity", relativeHorizontalProximity));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToDocValidateBeforeCall(String outPath, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToDoc(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToDocCall(outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to DOC format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.doc) (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToDoc(String outPath, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToDocWithHttpInfo(outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to DOC format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.doc) (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToDocWithHttpInfo(String outPath, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToDocValidateBeforeCall(outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to DOC format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.doc) (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToDocAsync(String outPath, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToDocValidateBeforeCall(outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToEpub
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.epub) (required)
     * @param contentRecognitionMode Property tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToEpubCall(String outPath, String contentRecognitionMode, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/epub";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (contentRecognitionMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("contentRecognitionMode", contentRecognitionMode));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToEpubValidateBeforeCall(String outPath, String contentRecognitionMode, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToEpub(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToEpubCall(outPath, contentRecognitionMode, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to EPUB format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.epub) (required)
     * @param contentRecognitionMode Property tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToEpub(String outPath, String contentRecognitionMode, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToEpubWithHttpInfo(outPath, contentRecognitionMode, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to EPUB format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.epub) (required)
     * @param contentRecognitionMode Property tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToEpubWithHttpInfo(String outPath, String contentRecognitionMode, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToEpubValidateBeforeCall(outPath, contentRecognitionMode, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to EPUB format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.epub) (required)
     * @param contentRecognitionMode Property tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToEpubAsync(String outPath, String contentRecognitionMode, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToEpubValidateBeforeCall(outPath, contentRecognitionMode, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToHtml
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.html) (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToHtmlCall(String outPath, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/html";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (additionalMarginWidthInPoints != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("additionalMarginWidthInPoints", additionalMarginWidthInPoints));
        if (compressSvgGraphicsIfAny != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("compressSvgGraphicsIfAny", compressSvgGraphicsIfAny));
        if (convertMarkedContentToLayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("convertMarkedContentToLayers", convertMarkedContentToLayers));
        if (defaultFontName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", defaultFontName));
        if (documentType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("documentType", documentType));
        if (fixedLayout != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fixedLayout", fixedLayout));
        if (imageResolution != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("imageResolution", imageResolution));
        if (minimalLineWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("minimalLineWidth", minimalLineWidth));
        if (preventGlyphsGrouping != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("preventGlyphsGrouping", preventGlyphsGrouping));
        if (splitCssIntoPages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("splitCssIntoPages", splitCssIntoPages));
        if (splitIntoPages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("splitIntoPages", splitIntoPages));
        if (useZOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("useZOrder", useZOrder));
        if (antialiasingProcessing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("antialiasingProcessing", antialiasingProcessing));
        if (cssClassNamesPrefix != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cssClassNamesPrefix", cssClassNamesPrefix));
        if (explicitListOfSavedPages != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "explicitListOfSavedPages", explicitListOfSavedPages));
        if (fontEncodingStrategy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fontEncodingStrategy", fontEncodingStrategy));
        if (fontSavingMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fontSavingMode", fontSavingMode));
        if (htmlMarkupGenerationMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("htmlMarkupGenerationMode", htmlMarkupGenerationMode));
        if (lettersPositioningMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lettersPositioningMethod", lettersPositioningMethod));
        if (pagesFlowTypeDependsOnViewersScreenSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pagesFlowTypeDependsOnViewersScreenSize", pagesFlowTypeDependsOnViewersScreenSize));
        if (partsEmbeddingMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("partsEmbeddingMode", partsEmbeddingMode));
        if (rasterImagesSavingMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("rasterImagesSavingMode", rasterImagesSavingMode));
        if (removeEmptyAreasOnTopAndBottom != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("removeEmptyAreasOnTopAndBottom", removeEmptyAreasOnTopAndBottom));
        if (saveShadowedTextsAsTransparentTexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("saveShadowedTextsAsTransparentTexts", saveShadowedTextsAsTransparentTexts));
        if (saveTransparentTexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("saveTransparentTexts", saveTransparentTexts));
        if (specialFolderForAllImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("specialFolderForAllImages", specialFolderForAllImages));
        if (specialFolderForSvgImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("specialFolderForSvgImages", specialFolderForSvgImages));
        if (trySaveTextUnderliningAndStrikeoutingInCss != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("trySaveTextUnderliningAndStrikeoutingInCss", trySaveTextUnderliningAndStrikeoutingInCss));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToHtmlValidateBeforeCall(String outPath, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToHtml(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToHtmlCall(outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to Html format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.html) (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToHtml(String outPath, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToHtmlWithHttpInfo(outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to Html format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.html) (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToHtmlWithHttpInfo(String outPath, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToHtmlValidateBeforeCall(outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to Html format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.html) (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToHtmlAsync(String outPath, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToHtmlValidateBeforeCall(outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToLaTeX
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tex) (required)
     * @param pagesCount Pages count. (optional)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToLaTeXCall(String outPath, Integer pagesCount, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/latex";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (pagesCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pagesCount", pagesCount));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToLaTeXValidateBeforeCall(String outPath, Integer pagesCount, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToLaTeX(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToLaTeXCall(outPath, pagesCount, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to LaTeX format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tex) (required)
     * @param pagesCount Pages count. (optional)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToLaTeX(String outPath, Integer pagesCount, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToLaTeXWithHttpInfo(outPath, pagesCount, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to LaTeX format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tex) (required)
     * @param pagesCount Pages count. (optional)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToLaTeXWithHttpInfo(String outPath, Integer pagesCount, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToLaTeXValidateBeforeCall(outPath, pagesCount, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to LaTeX format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tex) (required)
     * @param pagesCount Pages count. (optional)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToLaTeXAsync(String outPath, Integer pagesCount, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToLaTeXValidateBeforeCall(outPath, pagesCount, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToMobiXml
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.mobixml) (required)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToMobiXmlCall(String outPath, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/mobixml";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToMobiXmlValidateBeforeCall(String outPath, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToMobiXml(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToMobiXmlCall(outPath, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to MOBIXML format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.mobixml) (required)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToMobiXml(String outPath, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToMobiXmlWithHttpInfo(outPath, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to MOBIXML format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.mobixml) (required)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToMobiXmlWithHttpInfo(String outPath, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToMobiXmlValidateBeforeCall(outPath, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to MOBIXML format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.mobixml) (required)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToMobiXmlAsync(String outPath, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToMobiXmlValidateBeforeCall(outPath, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToPdfA
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param type Type of PdfA format. (required)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToPdfACall(String outPath, String type, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/pdfa";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToPdfAValidateBeforeCall(String outPath, String type, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToPdfA(Async)");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling putPdfInRequestToPdfA(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToPdfACall(outPath, type, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to PdfA format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param type Type of PdfA format. (required)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToPdfA(String outPath, String type, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToPdfAWithHttpInfo(outPath, type, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to PdfA format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param type Type of PdfA format. (required)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToPdfAWithHttpInfo(String outPath, String type, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToPdfAValidateBeforeCall(outPath, type, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to PdfA format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param type Type of PdfA format. (required)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToPdfAAsync(String outPath, String type, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToPdfAValidateBeforeCall(outPath, type, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToPptx
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pptx) (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToPptxCall(String outPath, Boolean separateImages, Boolean slidesAsImages, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/pptx";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (separateImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("separateImages", separateImages));
        if (slidesAsImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("slidesAsImages", slidesAsImages));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToPptxValidateBeforeCall(String outPath, Boolean separateImages, Boolean slidesAsImages, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToPptx(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToPptxCall(outPath, separateImages, slidesAsImages, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to PPTX format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pptx) (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToPptx(String outPath, Boolean separateImages, Boolean slidesAsImages, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToPptxWithHttpInfo(outPath, separateImages, slidesAsImages, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to PPTX format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pptx) (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToPptxWithHttpInfo(String outPath, Boolean separateImages, Boolean slidesAsImages, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToPptxValidateBeforeCall(outPath, separateImages, slidesAsImages, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to PPTX format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pptx) (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToPptxAsync(String outPath, Boolean separateImages, Boolean slidesAsImages, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToPptxValidateBeforeCall(outPath, separateImages, slidesAsImages, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToSvg
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.svg) (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToSvgCall(String outPath, Boolean compressOutputToZipArchive, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/svg";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (compressOutputToZipArchive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("compressOutputToZipArchive", compressOutputToZipArchive));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToSvgValidateBeforeCall(String outPath, Boolean compressOutputToZipArchive, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToSvg(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToSvgCall(outPath, compressOutputToZipArchive, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to SVG format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.svg) (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToSvg(String outPath, Boolean compressOutputToZipArchive, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToSvgWithHttpInfo(outPath, compressOutputToZipArchive, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to SVG format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.svg) (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToSvgWithHttpInfo(String outPath, Boolean compressOutputToZipArchive, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToSvgValidateBeforeCall(outPath, compressOutputToZipArchive, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to SVG format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.svg) (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToSvgAsync(String outPath, Boolean compressOutputToZipArchive, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToSvgValidateBeforeCall(outPath, compressOutputToZipArchive, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToTiff
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tiff) (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToTiffCall(String outPath, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/tiff";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (brightness != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("brightness", brightness));
        if (compression != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("compression", compression));
        if (colorDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("colorDepth", colorDepth));
        if (leftMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("leftMargin", leftMargin));
        if (rightMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("rightMargin", rightMargin));
        if (topMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("topMargin", topMargin));
        if (bottomMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("bottomMargin", bottomMargin));
        if (orientation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orientation", orientation));
        if (skipBlankPages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skipBlankPages", skipBlankPages));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("height", height));
        if (xResolution != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("xResolution", xResolution));
        if (yResolution != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("yResolution", yResolution));
        if (pageIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageIndex", pageIndex));
        if (pageCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageCount", pageCount));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToTiffValidateBeforeCall(String outPath, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToTiff(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToTiffCall(outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to TIFF format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tiff) (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToTiff(String outPath, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToTiffWithHttpInfo(outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to TIFF format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tiff) (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToTiffWithHttpInfo(String outPath, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToTiffValidateBeforeCall(outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to TIFF format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tiff) (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToTiffAsync(String outPath, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToTiffValidateBeforeCall(outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToXls
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xls) (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToXlsCall(String outPath, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/xls";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (insertBlankColumnAtFirst != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("insertBlankColumnAtFirst", insertBlankColumnAtFirst));
        if (minimizeTheNumberOfWorksheets != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("minimizeTheNumberOfWorksheets", minimizeTheNumberOfWorksheets));
        if (scaleFactor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("scaleFactor", scaleFactor));
        if (uniformWorksheets != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("uniformWorksheets", uniformWorksheets));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToXlsValidateBeforeCall(String outPath, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToXls(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToXlsCall(outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to XLS format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xls) (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToXls(String outPath, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToXlsWithHttpInfo(outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to XLS format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xls) (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToXlsWithHttpInfo(String outPath, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToXlsValidateBeforeCall(outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to XLS format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xls) (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToXlsAsync(String outPath, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToXlsValidateBeforeCall(outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToXml
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xml) (required)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToXmlCall(String outPath, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/xml";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToXmlValidateBeforeCall(String outPath, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToXml(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToXmlCall(outPath, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to XML format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xml) (required)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToXml(String outPath, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToXmlWithHttpInfo(outPath, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to XML format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xml) (required)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToXmlWithHttpInfo(String outPath, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToXmlValidateBeforeCall(outPath, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to XML format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xml) (required)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToXmlAsync(String outPath, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToXmlValidateBeforeCall(outPath, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInRequestToXps
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xps) (required)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToXpsCall(String outPath, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/xps";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInRequestToXpsValidateBeforeCall(String outPath, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInRequestToXps(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInRequestToXpsCall(outPath, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (in request content) to XPS format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xps) (required)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInRequestToXps(String outPath, File file) throws ApiException {
        ApiResponse<File> resp = putPdfInRequestToXpsWithHttpInfo(outPath, file);
        return resp.getData();
    }

    /**
     * Converts PDF document (in request content) to XPS format and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xps) (required)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInRequestToXpsWithHttpInfo(String outPath, File file) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInRequestToXpsValidateBeforeCall(outPath, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (in request content) to XPS format and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xps) (required)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInRequestToXpsAsync(String outPath, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInRequestToXpsValidateBeforeCall(outPath, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToDoc
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.doc) (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToDocCall(String name, String outPath, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/doc"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (addReturnToLineEnd != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("addReturnToLineEnd", addReturnToLineEnd));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (imageResolutionX != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("imageResolutionX", imageResolutionX));
        if (imageResolutionY != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("imageResolutionY", imageResolutionY));
        if (maxDistanceBetweenTextLines != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxDistanceBetweenTextLines", maxDistanceBetweenTextLines));
        if (mode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mode", mode));
        if (recognizeBullets != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("recognizeBullets", recognizeBullets));
        if (relativeHorizontalProximity != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("relativeHorizontalProximity", relativeHorizontalProximity));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToDocValidateBeforeCall(String name, String outPath, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToDoc(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToDoc(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToDocCall(name, outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to DOC format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.doc) (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToDoc(String name, String outPath, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToDocWithHttpInfo(name, outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to DOC format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.doc) (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToDocWithHttpInfo(String name, String outPath, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToDocValidateBeforeCall(name, outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to DOC format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.doc) (required)
     * @param addReturnToLineEnd Add return to line end. (optional)
     * @param format Allows to specify .doc or .docx file format. (optional)
     * @param imageResolutionX Image resolution X. (optional)
     * @param imageResolutionY Image resolution Y. (optional)
     * @param maxDistanceBetweenTextLines Max distance between text lines. (optional)
     * @param mode Allows to control how a PDF document is converted into a word processing document. (optional)
     * @param recognizeBullets Recognize bullets. (optional)
     * @param relativeHorizontalProximity Relative horizontal proximity. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToDocAsync(String name, String outPath, Boolean addReturnToLineEnd, String format, Integer imageResolutionX, Integer imageResolutionY, Integer maxDistanceBetweenTextLines, String mode, Boolean recognizeBullets, Double relativeHorizontalProximity, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToDocValidateBeforeCall(name, outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToEpub
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.epub) (required)
     * @param contentRecognitionMode �roperty tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToEpubCall(String name, String outPath, String contentRecognitionMode, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/epub"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (contentRecognitionMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("contentRecognitionMode", contentRecognitionMode));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToEpubValidateBeforeCall(String name, String outPath, String contentRecognitionMode, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToEpub(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToEpub(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToEpubCall(name, outPath, contentRecognitionMode, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to EPUB format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.epub) (required)
     * @param contentRecognitionMode �roperty tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToEpub(String name, String outPath, String contentRecognitionMode, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToEpubWithHttpInfo(name, outPath, contentRecognitionMode, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to EPUB format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.epub) (required)
     * @param contentRecognitionMode �roperty tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToEpubWithHttpInfo(String name, String outPath, String contentRecognitionMode, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToEpubValidateBeforeCall(name, outPath, contentRecognitionMode, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to EPUB format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.epub) (required)
     * @param contentRecognitionMode �roperty tunes conversion for this or that desirable method of recognition of content. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToEpubAsync(String name, String outPath, String contentRecognitionMode, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToEpubValidateBeforeCall(name, outPath, contentRecognitionMode, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToHtml
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.html) (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToHtmlCall(String name, String outPath, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/html"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (additionalMarginWidthInPoints != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("additionalMarginWidthInPoints", additionalMarginWidthInPoints));
        if (compressSvgGraphicsIfAny != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("compressSvgGraphicsIfAny", compressSvgGraphicsIfAny));
        if (convertMarkedContentToLayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("convertMarkedContentToLayers", convertMarkedContentToLayers));
        if (defaultFontName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", defaultFontName));
        if (documentType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("documentType", documentType));
        if (fixedLayout != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fixedLayout", fixedLayout));
        if (imageResolution != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("imageResolution", imageResolution));
        if (minimalLineWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("minimalLineWidth", minimalLineWidth));
        if (preventGlyphsGrouping != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("preventGlyphsGrouping", preventGlyphsGrouping));
        if (splitCssIntoPages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("splitCssIntoPages", splitCssIntoPages));
        if (splitIntoPages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("splitIntoPages", splitIntoPages));
        if (useZOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("useZOrder", useZOrder));
        if (antialiasingProcessing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("antialiasingProcessing", antialiasingProcessing));
        if (cssClassNamesPrefix != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cssClassNamesPrefix", cssClassNamesPrefix));
        if (explicitListOfSavedPages != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "explicitListOfSavedPages", explicitListOfSavedPages));
        if (fontEncodingStrategy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fontEncodingStrategy", fontEncodingStrategy));
        if (fontSavingMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fontSavingMode", fontSavingMode));
        if (htmlMarkupGenerationMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("htmlMarkupGenerationMode", htmlMarkupGenerationMode));
        if (lettersPositioningMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lettersPositioningMethod", lettersPositioningMethod));
        if (pagesFlowTypeDependsOnViewersScreenSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pagesFlowTypeDependsOnViewersScreenSize", pagesFlowTypeDependsOnViewersScreenSize));
        if (partsEmbeddingMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("partsEmbeddingMode", partsEmbeddingMode));
        if (rasterImagesSavingMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("rasterImagesSavingMode", rasterImagesSavingMode));
        if (removeEmptyAreasOnTopAndBottom != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("removeEmptyAreasOnTopAndBottom", removeEmptyAreasOnTopAndBottom));
        if (saveShadowedTextsAsTransparentTexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("saveShadowedTextsAsTransparentTexts", saveShadowedTextsAsTransparentTexts));
        if (saveTransparentTexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("saveTransparentTexts", saveTransparentTexts));
        if (specialFolderForAllImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("specialFolderForAllImages", specialFolderForAllImages));
        if (specialFolderForSvgImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("specialFolderForSvgImages", specialFolderForSvgImages));
        if (trySaveTextUnderliningAndStrikeoutingInCss != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("trySaveTextUnderliningAndStrikeoutingInCss", trySaveTextUnderliningAndStrikeoutingInCss));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToHtmlValidateBeforeCall(String name, String outPath, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToHtml(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToHtml(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToHtmlCall(name, outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to Html format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.html) (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToHtml(String name, String outPath, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToHtmlWithHttpInfo(name, outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to Html format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.html) (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToHtmlWithHttpInfo(String name, String outPath, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToHtmlValidateBeforeCall(name, outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to Html format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.html) (required)
     * @param additionalMarginWidthInPoints Defines width of margin that will be forcibly left around that output HTML-areas. (optional)
     * @param compressSvgGraphicsIfAny The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. (optional)
     * @param convertMarkedContentToLayers If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. (optional)
     * @param defaultFontName Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. (optional)
     * @param documentType Result document type. (optional)
     * @param fixedLayout The value indicating whether that HTML is created as fixed layout. (optional)
     * @param imageResolution Resolution for image rendering. (optional)
     * @param minimalLineWidth This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. (optional)
     * @param preventGlyphsGrouping This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. (optional)
     * @param splitCssIntoPages When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. (optional)
     * @param splitIntoPages The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. (optional)
     * @param useZOrder If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. (optional)
     * @param antialiasingProcessing The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. (optional)
     * @param cssClassNamesPrefix When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. (optional)
     * @param explicitListOfSavedPages With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. (optional)
     * @param fontEncodingStrategy Defines encoding special rule to tune PDF decoding for current document. (optional)
     * @param fontSavingMode Defines font saving mode that will be used during saving of PDF to desirable format. (optional)
     * @param htmlMarkupGenerationMode Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. (optional)
     * @param lettersPositioningMethod The mode of positioning of letters in words in result HTML. (optional)
     * @param pagesFlowTypeDependsOnViewersScreenSize If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. (optional)
     * @param partsEmbeddingMode It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. (optional)
     * @param rasterImagesSavingMode Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. (optional)
     * @param removeEmptyAreasOnTopAndBottom Defines whether in created HTML will be removed top and bottom empty area without any content (if any). (optional)
     * @param saveShadowedTextsAsTransparentTexts Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). (optional)
     * @param saveTransparentTexts Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. (optional)
     * @param specialFolderForAllImages The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param specialFolderForSvgImages The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. (optional)
     * @param trySaveTextUnderliningAndStrikeoutingInCss PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToHtmlAsync(String name, String outPath, Integer additionalMarginWidthInPoints, Boolean compressSvgGraphicsIfAny, Boolean convertMarkedContentToLayers, String defaultFontName, Integer documentType, Boolean fixedLayout, Integer imageResolution, Integer minimalLineWidth, Boolean preventGlyphsGrouping, Boolean splitCssIntoPages, Boolean splitIntoPages, Boolean useZOrder, String antialiasingProcessing, String cssClassNamesPrefix, List<Integer> explicitListOfSavedPages, String fontEncodingStrategy, String fontSavingMode, String htmlMarkupGenerationMode, String lettersPositioningMethod, Boolean pagesFlowTypeDependsOnViewersScreenSize, String partsEmbeddingMode, String rasterImagesSavingMode, Boolean removeEmptyAreasOnTopAndBottom, Boolean saveShadowedTextsAsTransparentTexts, Boolean saveTransparentTexts, String specialFolderForAllImages, String specialFolderForSvgImages, Boolean trySaveTextUnderliningAndStrikeoutingInCss, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToHtmlValidateBeforeCall(name, outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToLaTeX
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tex) (required)
     * @param pagesCount Pages count. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToLaTeXCall(String name, String outPath, Integer pagesCount, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/latex"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (pagesCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pagesCount", pagesCount));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToLaTeXValidateBeforeCall(String name, String outPath, Integer pagesCount, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToLaTeX(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToLaTeX(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToLaTeXCall(name, outPath, pagesCount, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to LaTeX format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tex) (required)
     * @param pagesCount Pages count. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToLaTeX(String name, String outPath, Integer pagesCount, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToLaTeXWithHttpInfo(name, outPath, pagesCount, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to LaTeX format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tex) (required)
     * @param pagesCount Pages count. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToLaTeXWithHttpInfo(String name, String outPath, Integer pagesCount, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToLaTeXValidateBeforeCall(name, outPath, pagesCount, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to LaTeX format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tex) (required)
     * @param pagesCount Pages count. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToLaTeXAsync(String name, String outPath, Integer pagesCount, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToLaTeXValidateBeforeCall(name, outPath, pagesCount, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToMobiXml
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.mobixml) (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToMobiXmlCall(String name, String outPath, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/mobixml"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToMobiXmlValidateBeforeCall(String name, String outPath, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToMobiXml(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToMobiXml(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToMobiXmlCall(name, outPath, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to MOBIXML format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.mobixml) (required)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToMobiXml(String name, String outPath, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToMobiXmlWithHttpInfo(name, outPath, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to MOBIXML format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.mobixml) (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToMobiXmlWithHttpInfo(String name, String outPath, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToMobiXmlValidateBeforeCall(name, outPath, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to MOBIXML format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.mobixml) (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToMobiXmlAsync(String name, String outPath, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToMobiXmlValidateBeforeCall(name, outPath, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToPdfA
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param type Type of PdfA format. (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToPdfACall(String name, String outPath, String type, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/pdfa"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToPdfAValidateBeforeCall(String name, String outPath, String type, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToPdfA(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToPdfA(Async)");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling putPdfInStorageToPdfA(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToPdfACall(name, outPath, type, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to PdfA format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param type Type of PdfA format. (required)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToPdfA(String name, String outPath, String type, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToPdfAWithHttpInfo(name, outPath, type, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to PdfA format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param type Type of PdfA format. (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToPdfAWithHttpInfo(String name, String outPath, String type, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToPdfAValidateBeforeCall(name, outPath, type, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to PdfA format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param type Type of PdfA format. (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToPdfAAsync(String name, String outPath, String type, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToPdfAValidateBeforeCall(name, outPath, type, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToPptx
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pptx) (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToPptxCall(String name, String outPath, Boolean separateImages, Boolean slidesAsImages, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/pptx"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (separateImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("separateImages", separateImages));
        if (slidesAsImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("slidesAsImages", slidesAsImages));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToPptxValidateBeforeCall(String name, String outPath, Boolean separateImages, Boolean slidesAsImages, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToPptx(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToPptx(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToPptxCall(name, outPath, separateImages, slidesAsImages, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to PPTX format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pptx) (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToPptx(String name, String outPath, Boolean separateImages, Boolean slidesAsImages, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToPptxWithHttpInfo(name, outPath, separateImages, slidesAsImages, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to PPTX format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pptx) (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToPptxWithHttpInfo(String name, String outPath, Boolean separateImages, Boolean slidesAsImages, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToPptxValidateBeforeCall(name, outPath, separateImages, slidesAsImages, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to PPTX format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pptx) (required)
     * @param separateImages Separate images. (optional)
     * @param slidesAsImages Slides as images. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToPptxAsync(String name, String outPath, Boolean separateImages, Boolean slidesAsImages, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToPptxValidateBeforeCall(name, outPath, separateImages, slidesAsImages, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToSvg
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.svg) (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToSvgCall(String name, String outPath, Boolean compressOutputToZipArchive, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/svg"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (compressOutputToZipArchive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("compressOutputToZipArchive", compressOutputToZipArchive));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToSvgValidateBeforeCall(String name, String outPath, Boolean compressOutputToZipArchive, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToSvg(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToSvg(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToSvgCall(name, outPath, compressOutputToZipArchive, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to SVG format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.svg) (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToSvg(String name, String outPath, Boolean compressOutputToZipArchive, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToSvgWithHttpInfo(name, outPath, compressOutputToZipArchive, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to SVG format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.svg) (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToSvgWithHttpInfo(String name, String outPath, Boolean compressOutputToZipArchive, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToSvgValidateBeforeCall(name, outPath, compressOutputToZipArchive, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to SVG format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.svg) (required)
     * @param compressOutputToZipArchive Specifies whether output will be created as one zip-archive. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToSvgAsync(String name, String outPath, Boolean compressOutputToZipArchive, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToSvgValidateBeforeCall(name, outPath, compressOutputToZipArchive, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToTiff
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tiff) (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToTiffCall(String name, String outPath, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/tiff"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (brightness != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("brightness", brightness));
        if (compression != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("compression", compression));
        if (colorDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("colorDepth", colorDepth));
        if (leftMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("leftMargin", leftMargin));
        if (rightMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("rightMargin", rightMargin));
        if (topMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("topMargin", topMargin));
        if (bottomMargin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("bottomMargin", bottomMargin));
        if (orientation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orientation", orientation));
        if (skipBlankPages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skipBlankPages", skipBlankPages));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("height", height));
        if (xResolution != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("xResolution", xResolution));
        if (yResolution != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("yResolution", yResolution));
        if (pageIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageIndex", pageIndex));
        if (pageCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageCount", pageCount));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToTiffValidateBeforeCall(String name, String outPath, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToTiff(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToTiff(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToTiffCall(name, outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to TIFF format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tiff) (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToTiff(String name, String outPath, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToTiffWithHttpInfo(name, outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to TIFF format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tiff) (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToTiffWithHttpInfo(String name, String outPath, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToTiffValidateBeforeCall(name, outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to TIFF format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.tiff) (required)
     * @param brightness Image brightness. (optional)
     * @param compression Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. (optional)
     * @param colorDepth Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. (optional)
     * @param leftMargin Left image margin. (optional)
     * @param rightMargin Right image margin. (optional)
     * @param topMargin Top image margin. (optional)
     * @param bottomMargin Bottom image margin. (optional)
     * @param orientation Image orientation. Possible values are: None, Landscape, Portait. (optional)
     * @param skipBlankPages Skip blank pages flag. (optional)
     * @param width Image width. (optional)
     * @param height Image height. (optional)
     * @param xResolution Horizontal resolution. (optional)
     * @param yResolution Vertical resolution. (optional)
     * @param pageIndex Start page to export. (optional)
     * @param pageCount Number of pages to export. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToTiffAsync(String name, String outPath, Double brightness, String compression, String colorDepth, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin, String orientation, Boolean skipBlankPages, Integer width, Integer height, Integer xResolution, Integer yResolution, Integer pageIndex, Integer pageCount, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToTiffValidateBeforeCall(name, outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToXls
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xls) (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToXlsCall(String name, String outPath, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/xls"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (insertBlankColumnAtFirst != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("insertBlankColumnAtFirst", insertBlankColumnAtFirst));
        if (minimizeTheNumberOfWorksheets != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("minimizeTheNumberOfWorksheets", minimizeTheNumberOfWorksheets));
        if (scaleFactor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("scaleFactor", scaleFactor));
        if (uniformWorksheets != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("uniformWorksheets", uniformWorksheets));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToXlsValidateBeforeCall(String name, String outPath, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToXls(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToXls(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToXlsCall(name, outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to XLS format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xls) (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToXls(String name, String outPath, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToXlsWithHttpInfo(name, outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to XLS format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xls) (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToXlsWithHttpInfo(String name, String outPath, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToXlsValidateBeforeCall(name, outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to XLS format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xls) (required)
     * @param insertBlankColumnAtFirst Insert blank column at first (optional)
     * @param minimizeTheNumberOfWorksheets Minimize the number of worksheets (optional)
     * @param scaleFactor Scale factor (optional)
     * @param uniformWorksheets Uniform worksheets (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToXlsAsync(String name, String outPath, Boolean insertBlankColumnAtFirst, Boolean minimizeTheNumberOfWorksheets, Double scaleFactor, Boolean uniformWorksheets, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToXlsValidateBeforeCall(name, outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToXml
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xml) (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToXmlCall(String name, String outPath, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/xml"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToXmlValidateBeforeCall(String name, String outPath, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToXml(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToXml(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToXmlCall(name, outPath, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to XML format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xml) (required)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToXml(String name, String outPath, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToXmlWithHttpInfo(name, outPath, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to XML format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xml) (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToXmlWithHttpInfo(String name, String outPath, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToXmlValidateBeforeCall(name, outPath, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to XML format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xml) (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToXmlAsync(String name, String outPath, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToXmlValidateBeforeCall(name, outPath, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPdfInStorageToXps
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xps) (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToXpsCall(String name, String outPath, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/xps"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPdfInStorageToXpsValidateBeforeCall(String name, String outPath, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPdfInStorageToXps(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putPdfInStorageToXps(Async)");
        }
        

        com.squareup.okhttp.Call call = putPdfInStorageToXpsCall(name, outPath, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document (located on storage) to XPS format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xps) (required)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putPdfInStorageToXps(String name, String outPath, String folder) throws ApiException {
        ApiResponse<File> resp = putPdfInStorageToXpsWithHttpInfo(name, outPath, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document (located on storage) to XPS format and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xps) (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putPdfInStorageToXpsWithHttpInfo(String name, String outPath, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPdfInStorageToXpsValidateBeforeCall(name, outPath, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document (located on storage) to XPS format and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.xps) (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPdfInStorageToXpsAsync(String name, String outPath, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPdfInStorageToXpsValidateBeforeCall(name, outPath, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putPrivileges
     * @param name The document name. (required)
     * @param privileges Document privileges.  (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPrivilegesCall(String name, DocumentPrivilege privileges, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = privileges;

        // create path and map variables
        String localVarPath = "/pdf/{name}/privileges"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putPrivilegesValidateBeforeCall(String name, DocumentPrivilege privileges, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPrivileges(Async)");
        }
        

        com.squareup.okhttp.Call call = putPrivilegesCall(name, privileges, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update privilege document.
     * 
     * @param name The document name. (required)
     * @param privileges Document privileges.  (optional)
     * @param folder The document folder. (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse putPrivileges(String name, DocumentPrivilege privileges, String folder) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = putPrivilegesWithHttpInfo(name, privileges, folder);
        return resp.getData();
    }

    /**
     * Update privilege document.
     * 
     * @param name The document name. (required)
     * @param privileges Document privileges.  (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> putPrivilegesWithHttpInfo(String name, DocumentPrivilege privileges, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putPrivilegesValidateBeforeCall(name, privileges, folder, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update privilege document. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param privileges Document privileges.  (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPrivilegesAsync(String name, DocumentPrivilege privileges, String folder, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putPrivilegesValidateBeforeCall(name, privileges, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putSearchableDocument
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param lang language for OCR engine. Possible values: eng, ara, bel, ben, bul, ces, dan, deu, ell, fin, fra, heb, hin, ind, isl, ita, jpn, kor, nld, nor, pol, por, ron, rus, spa, swe, tha, tur, ukr, vie, chi_sim, chi_tra or thier combination e.g. eng,rus  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSearchableDocumentCall(String name, String storage, String folder, String lang, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/ocr"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));
        if (lang != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lang", lang));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putSearchableDocumentValidateBeforeCall(String name, String storage, String folder, String lang, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSearchableDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = putSearchableDocumentCall(name, storage, folder, lang, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create searchable PDF document. Generate OCR layer for images in input PDF document.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param lang language for OCR engine. Possible values: eng, ara, bel, ben, bul, ces, dan, deu, ell, fin, fra, heb, hin, ind, isl, ita, jpn, kor, nld, nor, pol, por, ron, rus, spa, swe, tha, tur, ukr, vie, chi_sim, chi_tra or thier combination e.g. eng,rus  (optional)
     * @return SaaSposeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SaaSposeResponse putSearchableDocument(String name, String storage, String folder, String lang) throws ApiException {
        ApiResponse<SaaSposeResponse> resp = putSearchableDocumentWithHttpInfo(name, storage, folder, lang);
        return resp.getData();
    }

    /**
     * Create searchable PDF document. Generate OCR layer for images in input PDF document.
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param lang language for OCR engine. Possible values: eng, ara, bel, ben, bul, ces, dan, deu, ell, fin, fra, heb, hin, ind, isl, ita, jpn, kor, nld, nor, pol, por, ron, rus, spa, swe, tha, tur, ukr, vie, chi_sim, chi_tra or thier combination e.g. eng,rus  (optional)
     * @return ApiResponse&lt;SaaSposeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SaaSposeResponse> putSearchableDocumentWithHttpInfo(String name, String storage, String folder, String lang) throws ApiException {
        com.squareup.okhttp.Call call = putSearchableDocumentValidateBeforeCall(name, storage, folder, lang, null, null);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create searchable PDF document. Generate OCR layer for images in input PDF document. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param lang language for OCR engine. Possible values: eng, ara, bel, ben, bul, ces, dan, deu, ell, fin, fra, heb, hin, ind, isl, ita, jpn, kor, nld, nor, pol, por, ron, rus, spa, swe, tha, tur, ukr, vie, chi_sim, chi_tra or thier combination e.g. eng,rus  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSearchableDocumentAsync(String name, String storage, String folder, String lang, final ApiCallback<SaaSposeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSearchableDocumentValidateBeforeCall(name, storage, folder, lang, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SaaSposeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putSetProperty
     * @param name  (required)
     * @param propertyName  (required)
     * @param property  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSetPropertyCall(String name, String propertyName, DocumentProperty property, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = property;

        // create path and map variables
        String localVarPath = "/pdf/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putSetPropertyValidateBeforeCall(String name, String propertyName, DocumentProperty property, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSetProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling putSetProperty(Async)");
        }
        

        com.squareup.okhttp.Call call = putSetPropertyCall(name, propertyName, property, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add/update document property.
     * 
     * @param name  (required)
     * @param propertyName  (required)
     * @param property  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return DocumentPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertyResponse putSetProperty(String name, String propertyName, DocumentProperty property, String storage, String folder) throws ApiException {
        ApiResponse<DocumentPropertyResponse> resp = putSetPropertyWithHttpInfo(name, propertyName, property, storage, folder);
        return resp.getData();
    }

    /**
     * Add/update document property.
     * 
     * @param name  (required)
     * @param propertyName  (required)
     * @param property  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @return ApiResponse&lt;DocumentPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentPropertyResponse> putSetPropertyWithHttpInfo(String name, String propertyName, DocumentProperty property, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putSetPropertyValidateBeforeCall(name, propertyName, property, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<DocumentPropertyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add/update document property. (asynchronously)
     * 
     * @param name  (required)
     * @param propertyName  (required)
     * @param property  (optional)
     * @param storage  (optional)
     * @param folder  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSetPropertyAsync(String name, String propertyName, DocumentProperty property, String storage, String folder, final ApiCallback<DocumentPropertyResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSetPropertyValidateBeforeCall(name, propertyName, property, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentPropertyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putUpdateField
     * @param name The document name. (required)
     * @param fieldName The name of a field to be updated. (required)
     * @param field with the field data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putUpdateFieldCall(String name, String fieldName, Field field, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = field;

        // create path and map variables
        String localVarPath = "/pdf/{name}/fields/{fieldName}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "fieldName" + "\\}", apiClient.escapeString(fieldName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putUpdateFieldValidateBeforeCall(String name, String fieldName, Field field, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putUpdateField(Async)");
        }
        
        // verify the required parameter 'fieldName' is set
        if (fieldName == null) {
            throw new ApiException("Missing the required parameter 'fieldName' when calling putUpdateField(Async)");
        }
        

        com.squareup.okhttp.Call call = putUpdateFieldCall(name, fieldName, field, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update field.
     * 
     * @param name The document name. (required)
     * @param fieldName The name of a field to be updated. (required)
     * @param field with the field data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return FieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FieldResponse putUpdateField(String name, String fieldName, Field field, String storage, String folder) throws ApiException {
        ApiResponse<FieldResponse> resp = putUpdateFieldWithHttpInfo(name, fieldName, field, storage, folder);
        return resp.getData();
    }

    /**
     * Update field.
     * 
     * @param name The document name. (required)
     * @param fieldName The name of a field to be updated. (required)
     * @param field with the field data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;FieldResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FieldResponse> putUpdateFieldWithHttpInfo(String name, String fieldName, Field field, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putUpdateFieldValidateBeforeCall(name, fieldName, field, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<FieldResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update field. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param fieldName The name of a field to be updated. (required)
     * @param field with the field data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putUpdateFieldAsync(String name, String fieldName, Field field, String storage, String folder, final ApiCallback<FieldResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putUpdateFieldValidateBeforeCall(name, fieldName, field, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FieldResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putUpdateFields
     * @param name The document name. (required)
     * @param fields with the fields data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putUpdateFieldsCall(String name, Fields fields, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = fields;

        // create path and map variables
        String localVarPath = "/pdf/{name}/fields"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putUpdateFieldsValidateBeforeCall(String name, Fields fields, String storage, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putUpdateFields(Async)");
        }
        

        com.squareup.okhttp.Call call = putUpdateFieldsCall(name, fields, storage, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update fields.
     * 
     * @param name The document name. (required)
     * @param fields with the fields data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return FieldsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FieldsResponse putUpdateFields(String name, Fields fields, String storage, String folder) throws ApiException {
        ApiResponse<FieldsResponse> resp = putUpdateFieldsWithHttpInfo(name, fields, storage, folder);
        return resp.getData();
    }

    /**
     * Update fields.
     * 
     * @param name The document name. (required)
     * @param fields with the fields data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;FieldsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FieldsResponse> putUpdateFieldsWithHttpInfo(String name, Fields fields, String storage, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putUpdateFieldsValidateBeforeCall(name, fields, storage, folder, null, null);
        Type localVarReturnType = new TypeToken<FieldsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update fields. (asynchronously)
     * 
     * @param name The document name. (required)
     * @param fields with the fields data. (optional)
     * @param storage The document storage. (optional)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putUpdateFieldsAsync(String name, Fields fields, String storage, String folder, final ApiCallback<FieldsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putUpdateFieldsValidateBeforeCall(name, fields, storage, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FieldsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putXfaPdfInRequestToAcroForm
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param file A file to be converted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putXfaPdfInRequestToAcroFormCall(String outPath, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;

        // create path and map variables
        String localVarPath = "/pdf/convert/xfatoacroform";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putXfaPdfInRequestToAcroFormValidateBeforeCall(String outPath, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putXfaPdfInRequestToAcroForm(Async)");
        }
        

        com.squareup.okhttp.Call call = putXfaPdfInRequestToAcroFormCall(outPath, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document which contatins XFA form (in request content) to PDF with AcroForm and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param file A file to be converted. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putXfaPdfInRequestToAcroForm(String outPath, File file) throws ApiException {
        ApiResponse<File> resp = putXfaPdfInRequestToAcroFormWithHttpInfo(outPath, file);
        return resp.getData();
    }

    /**
     * Converts PDF document which contatins XFA form (in request content) to PDF with AcroForm and uploads resulting file to storage.
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param file A file to be converted. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putXfaPdfInRequestToAcroFormWithHttpInfo(String outPath, File file) throws ApiException {
        com.squareup.okhttp.Call call = putXfaPdfInRequestToAcroFormValidateBeforeCall(outPath, file, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document which contatins XFA form (in request content) to PDF with AcroForm and uploads resulting file to storage. (asynchronously)
     * 
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param file A file to be converted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putXfaPdfInRequestToAcroFormAsync(String outPath, File file, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putXfaPdfInRequestToAcroFormValidateBeforeCall(outPath, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putXfaPdfInStorageToAcroForm
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param folder The document folder. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putXfaPdfInStorageToAcroFormCall(String name, String outPath, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pdf/{name}/convert/xfatoacroform"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (outPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("outPath", outPath));
        if (folder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putXfaPdfInStorageToAcroFormValidateBeforeCall(String name, String outPath, String folder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putXfaPdfInStorageToAcroForm(Async)");
        }
        
        // verify the required parameter 'outPath' is set
        if (outPath == null) {
            throw new ApiException("Missing the required parameter 'outPath' when calling putXfaPdfInStorageToAcroForm(Async)");
        }
        

        com.squareup.okhttp.Call call = putXfaPdfInStorageToAcroFormCall(name, outPath, folder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param folder The document folder. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putXfaPdfInStorageToAcroForm(String name, String outPath, String folder) throws ApiException {
        ApiResponse<File> resp = putXfaPdfInStorageToAcroFormWithHttpInfo(name, outPath, folder);
        return resp.getData();
    }

    /**
     * Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and uploads resulting file to storage
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param folder The document folder. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putXfaPdfInStorageToAcroFormWithHttpInfo(String name, String outPath, String folder) throws ApiException {
        com.squareup.okhttp.Call call = putXfaPdfInStorageToAcroFormValidateBeforeCall(name, outPath, folder, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and uploads resulting file to storage (asynchronously)
     * 
     * @param name The document name. (required)
     * @param outPath Full resulting filename (ex. /folder1/folder2/result.pdf) (required)
     * @param folder The document folder. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putXfaPdfInStorageToAcroFormAsync(String name, String outPath, String folder, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putXfaPdfInStorageToAcroFormValidateBeforeCall(name, outPath, folder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
