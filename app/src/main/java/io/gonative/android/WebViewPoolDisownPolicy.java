package io.gonative.android;

public enum WebViewPoolDisownPolicy {
    Always, Reload, Never;

    public static WebViewPoolDisownPolicy defaultPolicy = WebViewPoolDisownPolicy.Reload;
}
