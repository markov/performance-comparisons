package org.gradle.test.performance43_4

import org.junit.Assert.*

class Test43_308 {
    private val production = Production43_308("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
