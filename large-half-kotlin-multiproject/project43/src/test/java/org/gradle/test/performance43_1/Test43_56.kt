package org.gradle.test.performance43_1

import org.junit.Assert.*

class Test43_56 {
    private val production = Production43_56("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
