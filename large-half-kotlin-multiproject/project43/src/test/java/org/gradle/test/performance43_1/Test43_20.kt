package org.gradle.test.performance43_1

import org.junit.Assert.*

class Test43_20 {
    private val production = Production43_20("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
