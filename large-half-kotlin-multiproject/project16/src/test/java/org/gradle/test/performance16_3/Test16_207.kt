package org.gradle.test.performance16_3

import org.junit.Assert.*

class Test16_207 {
    private val production = Production16_207("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}