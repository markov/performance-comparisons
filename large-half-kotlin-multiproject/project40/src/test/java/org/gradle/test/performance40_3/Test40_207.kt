package org.gradle.test.performance40_3

import org.junit.Assert.*

class Test40_207 {
    private val production = Production40_207("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}