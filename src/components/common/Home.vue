<template>
  <div>
    <header-component></header-component>
    <left-component></left-component>
    <div class="content">
      <transition name="move" mode="out-in"><router-view></router-view></transition>
    </div>
  </div>
</template>

<script>
  import HeaderComponent from '@/components/common/Header.vue'
  import LeftComponent from '@/components/common/Left.vue'
  export default {
    components: {
      HeaderComponent,
      LeftComponent
    },
    data() {
      return {}
    },
    methods: {}
  }
</script>
