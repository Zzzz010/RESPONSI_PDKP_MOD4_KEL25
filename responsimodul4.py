abjad = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

chiper = 1

def enkripsi(kata,cipher_key):
    kata = kata.lower()
    hasil_enkripsi = ' '
    for huruf in kata:
        if huruf in abjad:
            urutan_lama = abjad.index(huruf)
            urutan_baru = (urutan_lama + cipher_key ) %len(abjad)
            abjad_baru = abjad[urutan_baru]
            hasil_enkripsi = hasil_enkripsi + abjad_baru 
        else:
            hasil_enkripsi
    return hasil_enkripsi

def dekripsi(kata,cipher_key):
    kata = kata.lower()
    hasil_enkripsi = ' '
    for huruf in kata:
        if huruf in abjad:
            urutan_lama = abjad.index(huruf)
            urutan_baru = (urutan_lama + cipher_key ) %len(abjad)
            abjad_baru = abjad[urutan_baru]
            hasil_enkripsi = hasil_enkripsi + abjad_baru 
        else:
            hasil_enkripsi
    return hasil_enkripsi

print('DKP Modul 4 Kelompok 25\n')
kata = input('Masukkan kata yang ingin dienkripsi \t:  ')
kata_hasil = enkripsi(kata,chiper)
print('Kata yang dimasukkan adalah \t\t: ',kata)
print('\n\nKata setelah dienkripsi adalah \t\t:',kata_hasil)
kata_awal = dekripsi(kata_hasil,-chiper)
print('Kata sebelum dienkripsi adalah \t\t:',kata_awal)