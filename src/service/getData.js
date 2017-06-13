/**
 * Created by anniweiya on 6/13/17.
 */
import http from '@/js/http/http'
import {TEST_DATA} from '@/js/http/api'


export const getResource = () => http.methods.apiGet(TEST_DATA, {}).then(res => {
  return res.resourceList
});

