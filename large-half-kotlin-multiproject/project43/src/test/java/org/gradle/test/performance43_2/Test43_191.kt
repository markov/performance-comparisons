package org.gradle.test.performance43_2

import org.junit.Assert.*

class Test43_191 {
    private val production = Production43_191("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
