<template>
    <div>
        <h2>Meu Formulário</h2>
        <form action="">
        <div>
          <InputText />
        </div>
        <br>
       <div>
          <InputText />  
        </div>
        <br>
       <div>
          <Submit /> 
        </div>
    </form>
    </div>
</template>

<script>
    import InputText from './form/InputText.vue'
    import Submit from './form/Submit.vue'

    export default {
        name: 'Form',
        components: {
            InputText,
            Submit
        }    
    }
</script>