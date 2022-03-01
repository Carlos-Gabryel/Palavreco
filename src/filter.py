import pandas as pd

palavras_old = pd.read_csv('./src/palavras_old.txt')
palavras_old.columns = ['Palavra']

palavras_old['Palavra'] = palavras_old['Palavra'].astype('str')
mask = palavras_old['Palavra'].str.len() == 5
palavras = palavras_old.loc[mask]

palavras.to_csv('./src/palavras.txt', index=0, header=0)
