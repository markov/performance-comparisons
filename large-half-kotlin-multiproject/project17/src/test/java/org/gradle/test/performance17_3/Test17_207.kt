package org.gradle.test.performance17_3

import org.junit.Assert.*

class Test17_207 {
    private val production = Production17_207("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}