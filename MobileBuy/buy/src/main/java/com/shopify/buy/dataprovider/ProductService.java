/*
 *   The MIT License (MIT)
 *
 *   Copyright (c) 2015 Shopify Inc.
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */
package com.shopify.buy.dataprovider;

import com.shopify.buy.model.Collection;
import com.shopify.buy.model.Product;
import com.shopify.buy.model.Shop;

import java.util.List;

import rx.Observable;

public interface ProductService {

    void getShop(Callback<Shop> callback);

    Observable<Shop> getShop();

    void getProductPage(int page, Callback<List<Product>> callback);

    Observable<List<Product>> getProductPage(int page);

    void getProductWithHandle(String handle, Callback<Product> callback);

    Observable<Product> getProductWithHandle(String handle);

    void getProduct(String productId, Callback<Product> callback);

    Observable<Product> getProduct(String productId);

    void getProducts(List<String> productIds, Callback<List<Product>> callback);

    Observable<List<Product>> getProducts(List<String> productIds);

    void getProducts(int page, String collectionId, Callback<List<Product>> callback);

    Observable<List<Product>> getProducts(int page, String collectionId);

    void getProducts(int page, String collectionId, Collection.SortOrder sortOrder, Callback<List<Product>> callback);

    Observable<List<Product>> getProducts(int page, String collectionId, Collection.SortOrder sortOrder);

    void getCollections(Callback<List<Collection>> callback);

    Observable<List<Collection>> getCollections();

    void getCollectionPage(int page, Callback<List<Collection>> callback);

    Observable<List<Collection>> getCollections(int page);
}
