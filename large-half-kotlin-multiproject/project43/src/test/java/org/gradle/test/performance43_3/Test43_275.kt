package org.gradle.test.performance43_3

import org.junit.Assert.*

class Test43_275 {
    private val production = Production43_275("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
