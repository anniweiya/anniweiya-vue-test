/**
 * Created by anniweiya on 5/27/17.
 */
const apiMethods = {
  methods: {
    apiGet (url, data) {
      return new Promise((resolve, reject) => {
        axios.get(url, data).then((response) => {
          resolve(response.data)
        }, (response) => {
        })
      })
    },
    apiPost(url, data) {
      return new Promise((resolve, reject) => {
        axios.post(url, data).then((response) => {
          resolve(response.data)
        }).catch((response) => {
        })
      })
    },
  }
}

export default apiMethods
