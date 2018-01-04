package org.gradle.test.performance44_5

import org.junit.Assert.*

class Test44_404 {
    private val production = Production44_404("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
