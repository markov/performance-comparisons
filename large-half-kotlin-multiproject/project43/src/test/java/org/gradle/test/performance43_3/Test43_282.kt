package org.gradle.test.performance43_3

import org.junit.Assert.*

class Test43_282 {
    private val production = Production43_282("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
