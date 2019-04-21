/**
 * Created by anniweiya on 6/13/17.
 */
import http from '@/js/http/http'
import {API_QUERY_RESOURCELIST} from '@/js/http/api'


export const getResource = () => http.methods.apiPost(API_QUERY_RESOURCELIST, {}).then(res => {
  return res.data
});

