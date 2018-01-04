package org.gradle.test.performance43_2

import org.junit.Assert.*

class Test43_137 {
    private val production = Production43_137("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
