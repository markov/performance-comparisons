package org.gradle.test.performance43_4

import org.junit.Assert.*

class Test43_340 {
    private val production = Production43_340("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
