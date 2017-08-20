import {getResource} from '@/service/getData'
import {GET_RESOURCE} from '@/vuex/mutations_types'


export default {
  async loadResourceList({commit}){
    let res = await getResource();
    commit(GET_RESOURCE, res)
  },
  emptyResourceList({commit}) {
    commit(GET_RESOURCE, []);
  }
}
