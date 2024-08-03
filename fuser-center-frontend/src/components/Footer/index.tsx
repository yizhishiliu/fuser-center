import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
const Footer: React.FC = () => {
  const defaultMessage = '一之十六出品';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
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
          title: <><GithubOutlined />一之十六 Github</>,
          href: 'https://github.com/Mingdaj',
          blankTarget: true,
        },
      ]}
    />
  );
};
export default Footer;
