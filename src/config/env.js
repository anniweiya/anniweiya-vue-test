/**
 * Created by anniweiya on 6/13/17.
 */
let baseUrl = 'http://192.168.0.71:8081';


if (process.env.NODE_ENV == 'development') {

} else if (process.env.NODE_ENV == 'production') {

  // baseUrl = 'http://cangdu.org:8001';
}

export {
  baseUrl
}
