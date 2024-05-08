import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
import React from 'react';

const Footer: React.FC = () => {
  const defaultMessage = '大狐狸出品';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      style={{
        background: 'none',
      }}
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'user center',
          title: 'fuser-center',
          href: 'https://github.com/Mingdaj/user-center/',
          blankTarget: true,
        },
        {
          key: 'csdn',
          title: '我的博客',
          href: 'https://blog.csdn.net/weixin_52164430?spm=1000.2115.3001.5343',
          blankTarget: true,
        },
        {
          key: 'github',
          title: <><GithubOutlined />大狐狸 Github</>,
          href: 'https://github.com/Mingdaj',
          blankTarget: true,
        },
      ]}
    />
  );
};

export default Footer;
