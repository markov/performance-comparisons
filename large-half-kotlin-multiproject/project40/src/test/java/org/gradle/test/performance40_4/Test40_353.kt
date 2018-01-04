package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_353 {
    private val production = Production40_353("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}