package org.gradle.test.performance43_2

import org.junit.Assert.*

class Test43_142 {
    private val production = Production43_142("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
