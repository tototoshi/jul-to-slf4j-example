# jul-to-slf4j-example

```
$ sbt
> run
sbt:jul-to-slf4j-example> run
[info] running (fork) com.example.Hello
[info] 2021/10/23 10:54:32.108 [main] TRACE s.n.w.p.http.HttpURLConnection - ProxySelector Request for https://httpbin.org/post
[info] 2021/10/23 10:54:32.110 [main] TRACE s.n.w.p.http.HttpURLConnection - Looking for HttpClient for URL https://httpbin.org/post and proxy value of DIRECT
[info] 2021/10/23 10:54:32.111 [main] TRACE s.n.w.p.http.HttpURLConnection - Creating new HttpsClient with url:https://httpbin.org/post and proxy:DIRECT with connect timeout:1000
[info] 2021/10/23 10:54:32.311 [main] TRACE s.n.w.p.http.HttpURLConnection - Proxy used: DIRECT
[info] 2021/10/23 10:54:32.840 [main] DEBUG s.n.w.p.http.HttpURLConnection - sun.net.www.MessageHeader@8909f188 pairs: {POST /post HTTP/1.1: null}{Accept-Encoding: gzip,deflate}{content-type: application/x-www-form-urlencoded}{User-Agent: scalaj-http/2.4.2}{Host: httpbin.org}{Accept: text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2}{Connection: keep-alive}{Content-Length: 6}
[info] 2021/10/23 10:54:33.014 [main] TRACE s.n.w.p.http.HttpURLConnection - KeepAlive stream used: https://httpbin.org/post
[info] 2021/10/23 10:54:33.015 [main] DEBUG s.n.w.p.http.HttpURLConnection - sun.net.www.MessageHeader@79ca92b98 pairs: {null: HTTP/1.1 200 OK}{Date: Sat, 23 Oct 2021 01:54:34 GMT}{Content-Type: application/json}{Content-Length: 519}{Connection: keep-alive}{Server: gunicorn/19.9.0}{Access-Control-Allow-Origin: *}{Access-Control-Allow-Credentials: true}
[info] 2021/10/23 10:54:33.087 [main] INFO  com.example.Hello$ - {
[info]   "args": {},
...
```