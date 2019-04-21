/**
 * Created by anniweiya on 6/13/17.
 */
let baseUrl = 'http://ian1:8081';


if (process.env.NODE_ENV == 'development') {

} else if (process.env.NODE_ENV == 'production') {
  baseUrl = 'http://ian1';
}

export {
  baseUrl
}
