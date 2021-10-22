<template>
  <div 
  class="useraccount"
  >
    <v-row
    justify="center"
    class="pa-5"
    >
    <v-avatar 
    size="200"
    >
      <img
    src="pp.jpeg"
    >
    </v-avatar>
    </v-row>
    <v-form>
    <v-container>
      <v-row
      dense
      no-gutters
      >
        <v-col
          cols="12"
          sm="6"
        >
          <v-text-field
            v-model="name"
            label="Name"
            outlined
            readonly
            dense
          ></v-text-field>
        </v-col>
        <v-col
          cols="12"
          sm="6"
        >
          <v-text-field
            v-model="stdid"
            label="Student Id"
            outlined
            readonly
            dense
          ></v-text-field>
        </v-col>
        <v-col
          cols="12"
          sm="6"
        >
          <v-text-field
            v-model="email"
            label="Student Email"
            outlined
            readonly
            dense
          ></v-text-field>
        </v-col>
        <v-col
          cols="12"
          sm="6"
        >
          <v-text-field
            v-model="hpnumber"
            label="Telephone Number"
            outlined
            readonly
            dense
          ></v-text-field>
        </v-col>
        
        <v-col
          cols="12"
          sm="6"
        >
          <v-text-field
            v-model="stdic"
            label="IC Number"
            outlined
            readonly
            dense
          ></v-text-field>
        </v-col>
        <v-col
          cols="12"
          sm="6"
        >
          <v-text-field
            v-model="course"
            label="Course"
            outlined
            readonly
            dense
          ></v-text-field>
        </v-col>
        <v-col
          cols="12"
          sm="6"
        >
          <v-text-field
            v-model="major"
            label="Major"
            outlined
            readonly
            dense
          ></v-text-field>
        </v-col>
        <v-col
          cols="12"
          sm="6"
        >
          <v-text-field
            v-model="faculty"
            label="Faculty"
            outlined
            readonly
            dense
          ></v-text-field>
        </v-col>
        
        <v-col
          cols="12"
          sm="6"
        >
          <v-text-field
            v-model="citizenship"
            label="Citizenship"
            outlined
            readonly
            dense
          ></v-text-field>
        </v-col>
        <v-col
          cols="12"
          sm="6"
        >
          <v-text-field
            v-model="race"
            label="Race"
            outlined
            readonly
            dense
          ></v-text-field>
        </v-col>
        <v-col
          cols="12"
          sm="12"
        >
          <v-text-field
            v-model="address"
            label="Address"
            outlined
            readonly
            dense
          ></v-text-field>
        </v-col>
      </v-row>
    </v-container>
  </v-form>
  </div>
</template>

<script>
  export default {
    data: () => ({
      name: 'Nur Izzah Binti Muhammad Ismail Tadj',
      email: 'tadjizzah@gmail.com',
      stdid: 'CA17047',
      stdic: '980423****',
      course: 'Sarjana Muda Sains Komputer',
      major: 'BCN - Sistem Komputer & Rangkaian',
      faculty: 'Fakulti Komputeran',
      hpnumber: '011-19918759',
      citizenship: 'Malaysia',
      race: 'Malay',
      address: 'Lot 1007, Jalan Penimba Blok 6 Kampung Desa Murni Kerdau, 28010 Temerloh, Pahang'
    }),
  }
</script>