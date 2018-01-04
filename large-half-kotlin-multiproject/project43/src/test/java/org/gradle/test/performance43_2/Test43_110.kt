package org.gradle.test.performance43_2

import org.junit.Assert.*

class Test43_110 {
    private val production = Production43_110("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
