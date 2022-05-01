<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:foo="http://www.foo.org/" xmlns:bar="http://www.bar.org">
    <xsl:template match="/">
        <html>
            <body>
                <h2>club</h2>
                <table border="1">
                    <tr bgcolor="#9acd32">
                        <th>name</th>
                        <th>address</th>
                        <th>telephone</th>
                    </tr>
                    <xsl:for-each select="club">
                        <tr>
                            <td><xsl:value-of select="name"/></td>
                            <td><xsl:value-of select="address"/></td>
                            <td><xsl:value-of select="telephone"/></td>
                        </tr>
                    </xsl:for-each>
                    <h3>employees</h3>
                    <table border="2">
                        <tr bgcolor="#9acd32">
                            <th>name</th>
                            <th>lastname</th>
                            <th>telephone</th>
                            <th>position</th>
                        </tr>
                    <xsl:for-each select="club/employees/employee">
                        <tr>
                                <td><xsl:value-of select="name"/></td>
                                <td><xsl:value-of select="lastname"/></td>
                                <td><xsl:value-of select="telephone"/></td>
                                <td><xsl:value-of select="position"/></td>
                        </tr>
                    </xsl:for-each>
                        <h4>clients</h4>
                        <table border="3">
                            <tr bgcolor="#9acd32">
                                <th>name</th>
                                <th>lastname</th>
                                <th>membership</th>
                            </tr>
                            <xsl:for-each select="club/employees/empployee">
                            <tr>
                                <xsl:for-each select="clients/client">
                                    <td><xsl:value-of select="name"/></td>
                                    <td><xsl:value-of select="lastname"/></td>
                                    <td><xsl:value-of select="membership"/></td>
                                </xsl:for-each>
                            </tr>
                            </xsl:for-each>
                        </table>
                    </table>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>