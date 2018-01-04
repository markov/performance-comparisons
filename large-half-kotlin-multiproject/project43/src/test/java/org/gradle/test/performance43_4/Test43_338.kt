package org.gradle.test.performance43_4

import org.junit.Assert.*

class Test43_338 {
    private val production = Production43_338("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
